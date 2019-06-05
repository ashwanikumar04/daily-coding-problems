package in.ashwanik.dcp.problems.p31_60.p49;

class Solution {

    int maxSum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int maxTillNow = array[0];
        int currentMax = array[0];

        for (int index = 1; index < array.length; index++) {
            currentMax = Math.max(array[index], currentMax + array[index]);
            maxTillNow = Math.max(currentMax, maxTillNow);
        }
        return maxTillNow > 0 ? maxTillNow : 0;
    }
}


