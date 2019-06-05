package in.ashwanik.dcp.problems.p31_60.p44;

class Solution {


    int numberOfInversions(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        return mergeSort(array, array.length);
    }

    private int mergeSort(int[] array, int length) {
        int[] temp = new int[length];
        return mergeSort(array, temp, 0, length - 1);
    }

    private int mergeSort(int[] array, int[] temp, int left, int right) {
        int mid;
        int inversions = 0;
        if (right > left) {
            mid = ((right - left) / 2) + left;
            inversions = mergeSort(array, temp, left, mid);
            inversions += mergeSort(array, temp, mid + 1, right);
            inversions += merge(array, temp, left, mid + 1, right);
        }
        return inversions;
    }

    private int merge(int[] array, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid;
        int k = left;
        int inversionCount = 0;
        while ((i <= mid - 1) && j <= right) {
            if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
                inversionCount = inversionCount + mid - i;
            }
        }

        while (i <= mid - 1) {
            temp[k++] = array[i++];
        }
        while (j <= right) {
            temp[k++] = array[j++];
        }

        for (i = left; i <= right; i++) {
            array[i] = temp[i];
        }
        return inversionCount;
    }
}


