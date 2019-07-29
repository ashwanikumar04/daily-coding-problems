package in.ashwanik.dcp.problems.p151_180.p168;

class Solution {

    ///https://code.likeagirl.io/rotate-an-2d-matrix-90-degree-clockwise-without-create-another-array-49209ea8b6e6
    void rotate(int[][] array) {
        if (array == null || array.length == 0) {
            return;
        }

        int x = (int) Math.floor(array.length / 2);
        int y = array[0].length - 1;


        for (int i = 0; i < x; i++) {
            for (int j = i; j < y - i; j++) {
                int temp = array[i][j];
                array[i][j] = array[y - j][i];
                array[y - j][i] = array[y - i][y - j];
                array[y - i][y - j] = array[j][y - i];
                array[j][y - i] = temp;
            }
        }
    }
}