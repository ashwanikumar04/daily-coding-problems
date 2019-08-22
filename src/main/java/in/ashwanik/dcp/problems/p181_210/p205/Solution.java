package in.ashwanik.dcp.problems.p181_210.p205;

import java.util.Arrays;

class Solution {

    void nextNumber(int[] number) {
        if (number == null || number.length == 0) {
            return;
        }

        int breakIndex = -1;
        for (int index = number.length - 1; index > 0; index--) {
            if (number[index] > number[index - 1]) {
                breakIndex = index;
                break;
            }
        }

        if (breakIndex == -1) {
            return;
        }

        int digit = number[breakIndex - 1];
        int min = breakIndex;
        for (int index = breakIndex; index < number.length; index++) {

            if (number[index] > digit && number[index] < number[min]) {
                min = index;
            }
        }

        swap(number, breakIndex - 1, min);

        Arrays.sort(number, breakIndex, number.length);

    }

    private void swap(int[] number, int i, int min) {
        int temp = number[i];
        number[i] = number[min];
        number[min] = temp;
    }

}