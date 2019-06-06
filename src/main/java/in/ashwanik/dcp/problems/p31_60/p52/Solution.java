package in.ashwanik.dcp.problems.p31_60.p52;

import java.util.HashMap;
import java.util.Map;

class Solution {

    private int capacity;
    private Map<String, Entry> map;
    private Entry first;
    private Entry last;

    public Solution(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
    }

    private void add(Entry entry) {
        entry.next = null;
        entry.prev = null;
        if (first == null) {
            first = entry;
            last = entry;
            return;
        }

        entry.next = first;
        first.prev = entry;
        first = entry;
    }

    private void remove(Entry entry) {
        if (first == null || entry == null) {
            return;
        }

        if (first == entry && last == entry) {
            first = null;
            last = null;
            return;
        }

        if (first == entry) {
            first.next.prev = null;
            first = first.next;
            return;
        }
        if (last == entry) {
            last.prev.next = null;
            last = last.prev;
            return;
        }

        entry.prev.next = entry.next;
        entry.next.prev = entry.prev;
    }

    private void moveFirst(Entry entry) {
        remove(entry);
        add(entry);
    }

    private void removeLast() {
        remove(last);
    }

    void set(String key, String value) {
        Entry current = map.get(key);
        if (current != null) {
            current.value = value;
            moveFirst(current);
            return;
        }

        if (map.size() >= capacity) {
            map.remove(last.key);
            removeLast();
        }

        current = new Entry(key, value);
        add(current);
        map.put(key, current);
    }

    String get(String key) {
        Entry current = map.get(key);
        if (current != null) {
            moveFirst(current);
            return current.value;
        }
        return null;
    }

    static class Entry {
        private String key;
        private String value;
        private Entry next;
        private Entry prev;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
        }
    }
}


