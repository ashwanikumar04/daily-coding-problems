package in.ashwanik.dcp.problems.p31_60.p60;

class Solution {

    boolean equalSumSubset(int[] array) {
        if (array == null || array.length == 0) {
            return false;
        }

        int sum = 0;
        for (int number : array) {
            sum += number;
        }

        ///Sum odd, so can't divide the array in two equal parts
        if (sum % 2 != 0) {
            return false;
        }
        int halfSum = sum / 2;

        boolean[][] dp = new boolean[array.length + 1][halfSum + 1];

        for (int s = 1; s <= halfSum; s++) {
            dp[0][s] = false;
        }

        for (int i = 1; i <= array.length; i++) {
            dp[i][0] = true;
        }


        for (int i = 1; i <= array.length; i++) {
            for (int s = 1; s <= halfSum; s++) {
                dp[i][s] = dp[i - 1][s];

                if (!dp[i][s] && s >= array[i - 1]) {
                    dp[i][s] = dp[i][s] || dp[i - 1][s - array[i - 1]];
                }
            }
        }
        return dp[array.length][halfSum];
    }
}


