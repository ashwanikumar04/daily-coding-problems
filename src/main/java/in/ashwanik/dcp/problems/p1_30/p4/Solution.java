package in.ashwanik.dcp.problems.p1_30.p4;

class Solution {

    int missingInteger(int[] array) {
        if (array == null || array.length == 0) {
            return 1;
        }
        int size = array.length;
        int shift = partitionArrayInPositiveAndNegative(array);

        int newSize = size - shift;

        for (int current = shift; current < array.length; current++) {
            int abs = Math.abs(array[current]);
            if (abs - 1 + shift < newSize + shift && array[abs - 1 + shift] > 0) {
                array[abs - 1 + shift] = -array[abs - 1 + shift];
            }
        }

        for (int current = shift; current < array.length; current++) {
            if (array[current] > 0) {
                return current - shift + 1;
            }
        }
        return newSize + 1;
    }

    private int partitionArrayInPositiveAndNegative(int[] array) {
        int numberOfNegativeNumbers = 0;
        int start = 0;


        for (start = 0; start < array.length; start++) {

            if (array[start] <= 0) {
                int temp = array[start];
                array[start] = array[numberOfNegativeNumbers];
                array[numberOfNegativeNumbers] = temp;
                numberOfNegativeNumbers++;
            }
        }
        return numberOfNegativeNumbers;
    }
}
