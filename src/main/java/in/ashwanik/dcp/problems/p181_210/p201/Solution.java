package in.ashwanik.dcp.problems.p181_210.p201;

class Solution {


    /*
1 5 1
 2 3
  1
     */
    ///https://www.mathblog.dk/project-euler-18/
    int maxSum(int[][] array) {
        if (array == null) {
            return -1;
        }

        int maxArraySize = array[array.length - 1].length;

        int[] values = new int[maxArraySize];

        System.arraycopy(array[maxArraySize - 1], 0, values, 0, maxArraySize);

        for (int i = maxArraySize - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                values[j] = array[i][j] + Math.max(values[j], values[j + 1]);
            }
        }
        return values[0];
    }
}