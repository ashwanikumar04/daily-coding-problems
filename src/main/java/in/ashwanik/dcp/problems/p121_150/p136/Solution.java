package in.ashwanik.dcp.problems.p121_150.p136;

class Solution {

    int areaWithMaximum1(int[][] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int r = array.length;
        int c = array[0].length;

        int[][] response = new int[r][c];


        for (int index = 0; index < c; index++) {
            response[0][index] = array[0][index];
        }

        for (int index = 0; index < r; index++) {
            response[index][0] = array[index][0];
        }


        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if (array[i][j] == 1) {
                    response[i][j] = Math.min(response[i][j - 1], Math.min(response[i - 1][j], response[i - 1][j - 1])) + 1;
                } else {
                    response[i][j] = 0;
                }
            }
        }

        int max = response[0][0];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (max < response[i][j]) {
                    max = response[i][j];
                }
            }
        }
        return max * max;
    }
}