package in.ashwanik.dcp.problems.p121_150.p121;

class Solution {
    boolean isAtMostKPalindrome(String str, int k) {
        int distance = getEditDistance(str, new StringBuilder(str).reverse().toString());
        return distance <= k * 2;

    }

    private int getEditDistance(String a, String b) {
        int[][] result = new int[a.length() + 1][b.length() + 1];

        for (int index = 0; index <= a.length(); index++) {
            result[index][0] = index;
        }

        for (int index = 0; index <= b.length(); index++) {
            result[0][index] = index;
        }

        for (int i = 1; i <= a.length(); i++) {
            for (int j = 1; j <= b.length(); j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    result[i][j] = result[i - 1][j - 1];
                } else {
                    result[i][j] = 1 + Math.min(result[i - 1][j], result[i][j - 1]);
                }
            }
        }
        return result[a.length()][b.length()];
    }
}