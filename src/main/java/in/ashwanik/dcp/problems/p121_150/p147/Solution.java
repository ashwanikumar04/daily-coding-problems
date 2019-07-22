package in.ashwanik.dcp.problems.p121_150.p147;

class Solution {

    void pancakeSort(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        for (int index = array.length; index >= 0; index--) {
            int max = findMax(array, index);
            if (max != index - 1) {
                reverse(array, 0, max);
                reverse(array, 0, index - 1);
            }
        }
    }

    private int findMax(int[] array, int index) {
        int max = 0;
        int i = 0;
        for (i = 0; i < index; i++) {
            if (array[i] > array[max]) {
                max = i;
            }
        }
        return max;
    }

    private void reverse(int[] array, int start, int end) {
        if (start < 0 || end > array.length) {
            return;
        }
        int currentStart = start;
        int currentEnd = end;
        while (currentStart < currentEnd) {
            int temp = array[currentEnd];
            array[currentEnd] = array[currentStart];
            array[currentStart] = temp;
            currentEnd--;
            currentStart++;
        }
    }
}