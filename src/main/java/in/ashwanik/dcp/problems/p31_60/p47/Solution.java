package in.ashwanik.dcp.problems.p31_60.p47;

class Solution {
    int maxProfit(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int maxDiff = array[1] - array[0];
        int minSoFar = array[0];

        for (int index = 1; index < array.length; index++) {
            if (array[index] - minSoFar > maxDiff) {
                maxDiff = array[index] - minSoFar;
            }
            if (array[index] < minSoFar) {
                minSoFar = array[index];
            }
        }
        return maxDiff;
    }
}


