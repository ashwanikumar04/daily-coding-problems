package in.ashwanik.dcp.problems.p1_30.p2;

class Solution {
    int[] product(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        int length = array.length;

        int[] result = new int[length];

        int temp = 1;

        for (int index = 0; index < length; index++) {
            result[index] = temp;
            temp *= array[index];
        }

        temp = 1;
        for (int index = length - 1; index >= 0; index--) {
            result[index] *= temp;
            temp *= array[index];
        }

        return result;
    }
}
