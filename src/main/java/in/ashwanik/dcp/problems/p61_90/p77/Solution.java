package in.ashwanik.dcp.problems.p61_90.p77;

import java.util.ArrayList;
import java.util.List;

class Solution {
    List<int[]> mergeIntervals(List<int[]> intervals) {
        if (intervals == null || intervals.isEmpty()) {
            return null;
        }

        intervals.sort((o1, o2) -> o1[0] - o2[1]);

        int[] current = intervals.get(0);
        List<int[]> result = new ArrayList<>();

        for (int index = 1; index < intervals.size(); index++) {
            int[] item = intervals.get(index);
            if (item[0] <= current[1]) {
                current[1] = Math.max(current[1], item[1]);
            } else {
                result.add(current);
                current = item;
            }
        }
        result.add(current);
        return result;
    }
}
