package in.ashwanik.dcp.problems.p1_30.p9;

import static java.lang.Math.max;

class Solution {

    int getLargestSum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        int first = max(0, array[0]);
        int second = max(first, array[1]);
        int sum = second;
        for (int index = 2; index < array.length; index++) {
            sum = max(second, first + array[index]);
            first = second;
            second = sum;
        }
        return sum;
    }

}


