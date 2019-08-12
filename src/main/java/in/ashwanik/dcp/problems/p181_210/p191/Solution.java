package in.ashwanik.dcp.problems.p181_210.p191;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    int minimumNumberOfIntervalsToRemove(int[][] intervals) {
        if (intervals == null || intervals.length <= 1) {
            return -1;
        }

        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));

        int[] current = intervals[0];
        int nonOverlapping = 1;
        for (int index = 1; index < intervals.length; index++) {
            if (intervals[index][0] >= current[1]) {
                nonOverlapping++;
                current = intervals[index];
            }
        }
        return intervals.length - nonOverlapping;
    }
}