package in.ashwanik.dcp.problems.p181_210.p189;

import java.util.HashSet;
import java.util.Set;

class Solution {
    int maxDistinctLength(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int max = 0;
        int i = 0;
        int j = 1;
        int currentLength = 1;
        Set<Integer> set = new HashSet<>();
        set.add(array[0]);

        while (i < array.length - 1 && j < array.length) {
            if (set.contains(array[j])) {
                max = Math.max(currentLength, max);
                currentLength--;
                set.remove(array[i++]);
            } else {
                set.add(array[j++]);
                currentLength++;
            }
        }

        return Math.max(currentLength, max);
    }
}