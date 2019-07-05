package in.ashwanik.dcp.problems.p91_120.p119;

class Solution {

    int[] minimumIntervalSet(int[][] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        int index = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (index < array.length) {
            int lowIndex = array[index][0] < array[index][1] ? 0 : 1;
            max = Math.max(array[index][lowIndex], max);
            min = Math.min(array[index][lowIndex == 0 ? 1 : 0], min);
            index++;
        }
        return new int[]{Math.min(max, min), Math.max(min, max)};
    }
}