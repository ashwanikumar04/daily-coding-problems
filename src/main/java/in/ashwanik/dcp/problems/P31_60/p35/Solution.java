package in.ashwanik.dcp.problems.P31_60.p35;

class Solution {

    char[] sort(char[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        int low = 0;
        int mid = 0;
        int high = array.length - 1;

        while (mid <= high) {
            switch (array[mid]) {
                case 'R':
                    swap(array, low, mid);
                    low++;
                    mid++;
                    break;
                case 'G':
                    mid++;
                    break;
                case 'B':
                    swap(array, mid, high);
                    high--;
                    break;
            }
        }
        return array;
    }

    private void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}


