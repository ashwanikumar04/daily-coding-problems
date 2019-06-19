package in.ashwanik.dcp.problems.p91_120.p95;

import java.util.Arrays;

class Solution {
    //[1,2,3]
    //[3,2,1]
    int[] getNextNumber(int[] number) {
        if (number == null || number.length == 0) {
            return number;
        }
        int breakIndex = -1;
        for (int index = number.length - 2; index >= 0; index--) {
            if (number[index + 1] > number[index]) {
                breakIndex = index;
                break;
            }
        }
        if (breakIndex == -1) {
            Arrays.sort(number);
            return number;
        }
        int nextLowestIndex = breakIndex + 1;

        //Find lowest after break index
        while (nextLowestIndex < number.length - 1 && (number[nextLowestIndex] > number[nextLowestIndex + 1])) {
            nextLowestIndex++;
        }


        int temp = number[breakIndex];
        number[breakIndex] = number[nextLowestIndex];
        number[nextLowestIndex] = temp;

        Arrays.sort(number, breakIndex + 1, number.length);

        return number;
    }


}