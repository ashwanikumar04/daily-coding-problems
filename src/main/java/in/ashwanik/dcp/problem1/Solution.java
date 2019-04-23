package in.ashwanik.dcp.problem1;

import java.util.HashMap;
import java.util.Map;

class Solution {
    boolean sumExists(int[] array, int sum) {
        if (array == null || array.length == 0) {
            return false;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : array) {
            if (!map.containsKey(i)) {
                map.put(i, 0);
            }
            map.put(i, map.get(i) + 1);
        }

        for (int i : array) {
            int number = sum - i;
            if (number == i) {
                return map.get(number) > 1;
            } else {
                return map.containsKey(sum - i);
            }
        }
        return false;
    }
}
