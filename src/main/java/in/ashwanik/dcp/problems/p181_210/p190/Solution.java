package in.ashwanik.dcp.problems.p181_210.p190;

class Solution {
    ///https://linlaw0229.github.io/2018/10/22/918-Maximum-Sum-Circular-Subarray/
    int maxSubArraySum(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int maxKadane = maxSubArraySumHelper(array);
        if (maxKadane < 0) {
            return maxKadane;
        }
        int sum = 0;

        for (int index = 0; index < array.length; index++) {
            sum += array[index];
            array[index] = -array[index];
        }
        int maxWrap = sum + maxSubArraySumHelper(array);
        return Math.max(maxKadane, maxWrap);
    }

    private int maxSubArraySumHelper(int[] array) {
        int max = array[0];
        int currentSum = array[0];

        for (int index = 1; index < array.length; index++) {
            int currentIndex = index % array.length;
            currentSum = Math.max(array[currentIndex], currentSum + array[currentIndex]);
            max = Math.max(max, currentSum);
        }
        return Math.max(currentSum, max);
    }
}