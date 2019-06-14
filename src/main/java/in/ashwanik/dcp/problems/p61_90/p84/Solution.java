package in.ashwanik.dcp.problems.p61_90.p84;

class Solution {

    private int[] x = {0, 1, 1, 1, 0, -1, -1, -1};
    private int[] y = {1, 1, 0, -1, -1, -1, 0, 1};

    int numberOfIslands(boolean[][] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int islandCount = 0;
        boolean[][] visited = new boolean[array.length][array[0].length];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[0].length; column++) {
                if (array[row][column] && !visited[row][column]) {
                    dfs(array, visited, row, column);
                    islandCount++;
                }
            }
        }
        return islandCount;
    }

    private void dfs(boolean[][] array, boolean[][] visited, int row, int column) {
        visited[row][column] = true;
        for (int index = 0; index < 8; index++) {
            if (isValid(array, visited, row + x[index], column + y[index])) {
                dfs(array, visited, row + x[index], column + y[index]);
            }
        }
    }

    private boolean isValid(boolean[][] array, boolean[][] visited, int row, int column) {
        return row >= 0 && row < array.length && column >= 0 && column < array[0].length && !visited[row][column] && array[row][column];
    }
}