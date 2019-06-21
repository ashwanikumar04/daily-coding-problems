package in.ashwanik.dcp.problems.p91_120.p102;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    private Map<Integer, Integer> map;

    Solution() {
        map = new HashMap<>();
    }

    int[] getContinuousArray(int[] array, int sum) {
        if (array == null || array.length == 0) {
            return new int[0];
        }
        int currentSum = 0;
        int start = 0;
        int end = -1;
        map.put(0, -1);
        for (int index = 0; index < array.length; index++) {
            currentSum = currentSum + array[index];
            if (map.containsKey(currentSum - sum)) {
                start = map.get(currentSum - sum) + 1;
                end = index;
                break;
            }
            map.put(currentSum, index);
        }
        if (end == -1) {
            return new int[0];
        } else {
            List<Integer> result = new ArrayList<>();
            for (int index = start; index <= end; index++) {
                result.add(array[index]);
            }
            return result.stream().mapToInt(x -> x).toArray();
        }
    }
}