package in.ashwanik.dcp.problems.p91_120.p97;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Objects;
import java.util.TreeMap;

class Solution {
    private Map<Integer, NavigableMap<Integer, Integer>> map;

    Solution() {
        map = new HashMap<>();
    }

    void clear() {
        map.clear();
    }

    void set(Integer key, Integer value, Integer time) {
        map.putIfAbsent(key, new TreeMap<>());
        map.get(key).put(time, value);
    }

    Integer get(Integer key, Integer time) {
        NavigableMap<Integer, Integer> value = map.get(key);
        if (Objects.isNull(value)) {
            return null;
        }

        Map.Entry<Integer, Integer> timedValue = value.floorEntry(time);
        if (Objects.isNull(timedValue)) {
            return null;
        }
        return timedValue.getValue();
    }
}