package in.ashwanik.dcp.problems.p181_210.p203;

class Solution {

    //// 5 7 10 15 17 3 4

    /// 10 3 4 5 6 7 8

    int getMinimum(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }

        int low = 0;
        int high = array.length - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + (high - low) / 2;

            if (mid + 1 < array.length && array[mid] > array[mid + 1]) {
                return array[mid + 1];
            }

            if (array[mid] > array[high]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return array[mid];
    }
}