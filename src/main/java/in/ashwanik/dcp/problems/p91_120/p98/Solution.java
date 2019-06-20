package in.ashwanik.dcp.problems.p91_120.p98;

import java.util.HashSet;
import java.util.Set;

class Solution {
    int getLongestConsecutiveSequenceLength(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int n : numbers) {
            set.add(n);
        }

        int max = 0;
        for (int n : numbers) {
            int k = n;
            int count = 1;
            while (set.contains(++k)) {
                count++;
            }
            max = Math.max(max, count);
        }
        return max;
    }
}