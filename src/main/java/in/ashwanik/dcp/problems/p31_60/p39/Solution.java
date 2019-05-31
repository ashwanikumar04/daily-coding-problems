package in.ashwanik.dcp.problems.p31_60.p39;

class Solution {

    private int[] X = {0, 1, 1, 1, 0, -1, -1, -1};
    private int[] Y = {1, 1, 0, -1, -1, -1, 0, 1};

    boolean[][] nextGeneration(boolean[][] current) {
        int M = current.length;
        int N = current[0].length;
        boolean[][] next = new boolean[M][N];
        ///Ignoring the edges
        for (int i = 1; i < M - 1; i++) {
            for (int j = 1; j < N - 1; j++) {
                int neighbours = getNeighborsCount(current, i, j);
                if (current[i][j] && neighbours < 2) {
                    next[i][j] = false;
                } else if (current[i][j] && neighbours > 3) {
                    next[i][j] = false;
                } else if (!current[i][j] && neighbours == 3) {
                    next[i][j] = true;
                } else {
                    next[i][j] = current[i][j];
                }
            }
        }
        return next;
    }

    private int getNeighborsCount(boolean[][] current, int i, int j) {
        int count = 0;
        for (int index = 0; index < 8; index++) {
            if (current[i + X[index]][j + Y[index]]) {
                count++;
            }
        }
        return count;
    }
}


