package in.ashwanik.dcp.problems.p31_60.p42;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    List<Integer> getSubset(int[] array, int sum) {
        List<Integer> set = new ArrayList<>();

        if (array == null || array.length == 0) {
            return set;
        }
        boolean[][] dp = new boolean[array.length + 1][sum + 1];

        for (int index = 1; index <= sum; index++) {
            dp[0][index] = false;
        }
        for (int index = 0; index <= array.length; index++) {
            dp[index][0] = true;
        }

        for (int i = 1; i <= array.length; i++) {
            for (int s = 1; s <= sum; s++) {
                dp[i][s] = dp[i - 1][s];
                if (!dp[i][s] && s >= array[i - 1]) {
                    dp[i][s] = dp[i][s] || dp[i - 1][s - array[i - 1]];
                }
            }
        }

        printArray(dp);
        if (!dp[array.length][sum]) {
            return set;
        }

        int currentSum = sum;
        int i = array.length;
        int s = sum;
        Set<Integer> index = new HashSet<>();
        while (i > 0 && s > 0 && currentSum > 0) {
            if (dp[i][s]) {
                if (!dp[i - 1][s]) {
                    currentSum -= array[i - 1];
                    index.add(i - 1);
                    s -= array[i - 1];
                } else {
                    i--;
                }
            }
        }

        index.forEach(x -> set.add(array[x]));
        return set;
    }

    private void printArray(boolean[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int s = 0; s < array[0].length; s++) {
                System.out.print(array[i][s] ? "T\t" : "F\t");
            }
            System.out.println("");
        }
    }
}


