package in.ashwanik.dcp.problems.p181_210.p197;

class Solution {

    void rotateArrayToRight(int[] array, int k) {
        if (array == null || array.length == 0) {
            return;
        }
        reverse(array, 0, array.length - 1);
        reverse(array, 0, k - 1);
        reverse(array, k, array.length - 1);
    }

    private void reverse(int[] array, int start, int end) {
        int low = start;
        int high = end;
        while (low < high) {
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
            low++;
            high--;
        }
    }
}