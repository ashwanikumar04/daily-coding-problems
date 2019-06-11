package in.ashwanik.dcp.problems.p61_90.p69;

class Solution {

    int maxMultiplication(int[] array) {
        int max1 = 0;
        int max2 = -1;
        int max3 = -1;

        for (int index = 1; index < array.length; index++) {
            if (array[index] > array[max1]) {
                max3 = max2;
                max2 = max1;
                max1 = index;
            } else if (max2 == -1 || array[index] > array[max2]) {
                max3 = max2;
                max2 = index;
            } else if (max3 == -1 || array[index] > array[max3]) {
                max3 = index;
            }
        }

        int min1 = 0;
        int min2 = -1;
        for (int index = 1; index < array.length; index++) {
            if (array[index] < array[min1]) {
                min2 = min1;
                min1 = index;
            } else if (min2 == -1 || array[index] < array[min2]) {
                min2 = index;
            }
        }

        return Math.max(array[max1] * array[max2] * array[max3], array[max1] * array[min1] * array[min2]);
    }
}


