package in.ashwanik.dcp.problems.p31_60.p58;

class Solution {

    Integer findNumber(int[] array, int number) {
        if (array == null || array.length == 0) {
            return null;
        }
        return find(array, number, 0, array.length - 1);
    }

    private Integer find(int[] array, int number, int low, int high) {
        int mid = ((high - low) / 2) + low;
        if (low > high) {
            return null;
        }
        if (array[mid] == number) {
            return mid;
        }
        if (array[low] <= array[mid]) {
            if (array[low] <= number && array[mid] >= number) {
                return find(array, number, low, mid - 1);
            } else {
                return find(array, number, mid + 1, high);
            }
        } else {
            if (array[mid] <= number && number <= array[high]) {
                return find(array, number, mid + 1, high);
            } else {
                return find(array, number, low, mid - 1);
            }
        }
    }
}


