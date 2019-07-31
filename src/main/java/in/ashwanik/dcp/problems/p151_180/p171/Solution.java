package in.ashwanik.dcp.problems.p151_180.p171;

import java.util.List;

class Solution {

    Pair getPeriod(List<Entry> entries) {
        if (entries == null || entries.isEmpty()) {
            return null;
        }

        entries.sort((o1, o2) -> (int) (o1.timestamp - o2.timestamp));
        int max = 0;
        int current = 0;

        Pair period = null;
        for (int index = 0; index < entries.size(); index++) {
            Entry currentEntry = entries.get(index);
            if (currentEntry.type.equals("entry")) {
                current += currentEntry.count;
            } else {
                current -= currentEntry.count;
            }

            if (current > max) {
                max = current;
                period = new Pair(currentEntry.timestamp, entries.get(index + 1).timestamp);
            }
        }

        return period;
    }

    static class Pair {
        private long start;
        private long end;

        Pair(long start, long end) {
            this.start = start;
            this.end = end;
        }

        public long getStart() {
            return start;
        }

        public long getEnd() {
            return end;
        }
    }


    static class Entry {
        private long timestamp;
        private int count;
        private String type;

        Entry(long timestamp, int count, String type) {
            this.timestamp = timestamp;
            this.count = count;
            this.type = type;
        }

        public long getTimestamp() {
            return timestamp;
        }

        public int getCount() {
            return count;
        }

        public String getType() {
            return type;
        }
    }

}