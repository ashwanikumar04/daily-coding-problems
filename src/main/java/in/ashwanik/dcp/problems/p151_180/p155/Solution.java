package in.ashwanik.dcp.problems.p151_180.p155;

import java.util.HashMap;
import java.util.Map;

class Solution {


    int getMajorityElement(int[] array) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : array) {
            map.putIfAbsent(i, 1);
            map.put(i, map.get(i) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= array.length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }
}