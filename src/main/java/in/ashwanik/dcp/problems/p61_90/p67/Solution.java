package in.ashwanik.dcp.problems.p61_90.p67;

import java.util.*;

class Solution {

    private Map<String, Entry> map;
    private List<Set<Entry>> lists;
    private int lowestFrequency;
    private int maxFrequency;
    private int capacity;

    Solution(int capacity) {
        map = new HashMap<>();
        lists = new ArrayList<>();
        this.capacity = capacity;
        lowestFrequency = 0;
        this.maxFrequency = capacity - 1;
        for (int index = 0; index < capacity; index++) {
            lists.add(new LinkedHashSet<>());
        }
    }

    void put(String key, String value) {
        Entry entry = map.get(key);
        if (entry == null) {
            if (map.size() >= capacity) {
                Set<Entry> currentList = lists.get(lowestFrequency);
                Entry toDelete = currentList.iterator().next();
                currentList.remove(toDelete);
                map.remove(toDelete.key);
            }
            Entry newEntry = new Entry(key, value);
            Set<Entry> currentList = lists.get(0);
            currentList.add(newEntry);
            map.put(key, newEntry);
            lowestFrequency = 0;
        } else {
            entry.value = value;
        }
    }

    String get(String key) {
        Entry entry = map.get(key);
        if (entry == null) {
            return null;
        } else {
            int currentFrequency = entry.count;
            if (currentFrequency < maxFrequency) {
                int nextFrequency = currentFrequency + 1;
                Set<Entry> newNodes = lists.get(nextFrequency);
                Set<Entry> currentNodes = lists.get(currentFrequency);
                currentNodes.remove(entry);
                newNodes.add(entry);
                if (lowestFrequency == currentFrequency && currentNodes.isEmpty()) {
                    lowestFrequency = nextFrequency;
                }
            } else {
                lists.get(currentFrequency).remove(entry);
                lists.get(currentFrequency).add(entry);
            }
        }
        return entry.value;
    }

    static class Entry {
        private String key;
        private String value;
        private int count;

        Entry(String key, String value) {
            this.key = key;
            this.value = value;
            this.count = 0;
        }

        public String getKey() {
            return key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }


}


