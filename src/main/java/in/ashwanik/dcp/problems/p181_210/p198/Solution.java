package in.ashwanik.dcp.problems.p181_210.p198;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    List<Integer> getSubset(int[] array) {
        List<Integer> list = new ArrayList<>();
        if (array == null || array.length == 0) {
            return list;
        }
        Arrays.sort(array);

        int[] numberArray = new int[array.length];
        Arrays.fill(numberArray, 1);
        int[] previousDivisorIndex = new int[array.length];
        Arrays.fill(previousDivisorIndex, -1);
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] % array[j] == 0 && (numberArray[i] < numberArray[j] + 1)) {
                    numberArray[i] = numberArray[j] + 1;
                    previousDivisorIndex[i] = j;
                }
            }

            if (numberArray[maxIndex] < numberArray[i]) {
                maxIndex = i;
            }
        }
        int i = maxIndex;
        while (i >= 0) {
            list.add(array[i]);
            i = previousDivisorIndex[i];
        }

        return list;
    }
}