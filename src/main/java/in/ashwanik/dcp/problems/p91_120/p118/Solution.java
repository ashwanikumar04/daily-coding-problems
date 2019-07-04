package in.ashwanik.dcp.problems.p91_120.p118;

class Solution {

    int[] sortArray(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        int negative = -1;

        for (int index = 0; index < array.length; index++) {
            if (array[index] < 0) {
                negative = index;
            }
        }

        int left = negative;

        int right = negative + 1;


        int[] result = new int[array.length];
        int k = 0;
        while (left >= 0 && right < array.length) {
            int leftNumber = Math.abs(array[left]);
            int rightNumber = Math.abs(array[right]);

            if (leftNumber < rightNumber) {
                result[k] = leftNumber * leftNumber;
                left--;
            } else {
                result[k] = rightNumber * rightNumber;
                right++;
            }
            k++;
        }

        while (left >= 0) {
            result[k++] = array[left] * array[left];
            left--;
        }

        while (right < array.length) {
            result[k++] = array[right] * array[right];
            right++;
        }


        return result;
    }

}