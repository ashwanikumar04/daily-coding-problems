package in.ashwanik.dcp.problems.p31_60.p31;

class Solution {


    int editDistanceBF(String a, String b) {
        if (a == null && b == null) {
            return 0;
        }
        if (a == null) {
            return b.length();
        }
        if (b == null) {
            return a.length();
        }
        return editDistanceUtil(a, b, a.length(), b.length());
    }

    private int editDistanceUtil(String a, String b, int m, int n) {
        if (m == 0) {
            return n;
        }
        if (n == 0) {
            return m;
        }
        if (a.charAt(m - 1) == b.charAt(n - 1)) {
            return editDistanceUtil(a, b, m - 1, n - 1);
        }
        int insertion = editDistanceUtil(a, b, m, n - 1);
        int deletion = editDistanceUtil(a, b, m - 1, n);
        int replace = editDistanceUtil(a, b, m - 1, n - 1);
        return 1 + Math.min(replace, Math.min(insertion, deletion));
    }

    int editDistance(String a, String b) {
        if (a == null && b == null) {
            return 0;
        }
        if (a == null) {
            return b.length();
        }
        if (b == null) {
            return a.length();
        }
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
                    result[i][j] = 1 + Math.min(result[i - 1][j - 1], Math.min(result[i - 1][j], result[i][j - 1]));
                }
            }
        }
        return result[a.length()][b.length()];
    }
}


