package in.ashwanik.dcp.problems.p151_180.p156;

class Solution {

    int minimumNumberOfSquaresBF(int number) {
        if (number <= 3) {
            return number;
        }

        int result = number;

        for (int i = 1; i <= number; i++) {
            int temp = i * i;

            if (temp > number) {
                break;
            } else {
                result = Math.min(result, 1 + minimumNumberOfSquaresBF(number - temp));
            }
        }
        return result;
    }

    int minimumNumberOfSquaresDP(int number) {
        if (number <= 3) {
            return number;
        }

        int[] dp = new int[number + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for (int i = 4; i <= number; i++) {
            dp[i] = i;

            for (int x = 1; x <= i; x++) {
                int temp = x * x;
                if (temp > i) {
                    break;
                } else {
                    dp[i] = Math.min(dp[i], 1 + dp[i - temp]);
                }
            }
        }
        return dp[number];
    }
}