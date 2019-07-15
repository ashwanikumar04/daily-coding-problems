package in.ashwanik.dcp.problems.p121_150.p134;

import java.util.HashMap;
import java.util.Map;

class Solution {

    Map<Integer, Integer> map;

    Solution() {
        map = new HashMap<>();
    }

    void init(Integer[] array, int size) {
        for (int index = 0; index < size; index++) {
            if (array[index] != null) {
                map.put(index, array[index]);
            }
        }
    }

    void set(int index, Integer value) {
        if (value == null) {
            map.remove(index);
        } else {
            map.put(index, value);
        }
    }

    Integer get(int index) {
        return map.get(index);
    }

}