package in.ashwanik.dcp.problems.p121_150.p143;

class Solution {

    void partition(int[] array, int pivot) {
        if (array == null || array.length == 0) {
            return;
        }

        int start = 0;
        int end = array.length - 1;
        for (int i = 0; i <= end; ) {

            if (array[i] < pivot) {
                int temp = array[i];
                array[i] = array[start];
                array[start] = temp;
                start++;
                i++;
            } else if (array[i] > pivot) {
                int temp = array[i];
                array[i] = array[end];
                array[end] = temp;
                end--;
            } else {
                i++;
            }
        }
    }
}