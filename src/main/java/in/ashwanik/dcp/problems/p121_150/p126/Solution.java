package in.ashwanik.dcp.problems.p121_150.p126;

class Solution {
    void rotateArray(int[] array, int k) {
        if (array == null || array.length < k) {
            return;
        }

        for (int index = 0; index < k; index++) {
            rotateArrayByOne(array);
        }
    }

    private void rotateArrayByOne(int[] array) {
        int index;
        int first = array[0];
        for (index = 0; index < array.length - 1; index++) {
            array[index] = array[index + 1];
        }
        array[index] = first;
    }
}