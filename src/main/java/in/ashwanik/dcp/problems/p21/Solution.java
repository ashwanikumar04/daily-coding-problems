package in.ashwanik.dcp.problems.p21;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {

    int getMinimumNumberOfRooms(List<int[]> intervals) {
        if (intervals == null || intervals.isEmpty()) {
            return 0;
        }
        List<Pair> entries = new ArrayList<>();
        for (int[] entry : intervals) {
            entries.add(new Pair(entry[0], false));
            entries.add(new Pair(entry[1], true));
        }
        entries.sort(Comparator.comparingInt(o -> o.value));
        int numberOfRooms = 0;
        int result = 0;
        for (Pair entry : entries) {
            if (entry.isEnd()) {
                numberOfRooms--;
            } else {
                numberOfRooms++;
                if (numberOfRooms > result) {
                    result = numberOfRooms;
                }
            }
        }
        return result;
    }

    static class Pair {
        private int value;
        private boolean isEnd;

        Pair(int value, boolean isEnd) {
            this.value = value;
            this.isEnd = isEnd;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public boolean isEnd() {
            return isEnd;
        }

        public void setEnd(boolean end) {
            isEnd = end;
        }
    }
}


