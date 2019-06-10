package in.ashwanik.dcp.problems.p61_90.p65;

import java.util.ArrayList;
import java.util.List;

class Solution {

    int[] printSpiral(int[][] array) {
        if (array == null || array.length == 0) {
            return new int[0];
        }

        List<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = array.length - 1;
        int left = 0;
        int right = array[0].length - 1;
        int dir = 0;

        while (top <= bottom && left <= right) {
            switch (dir) {
                case 0:
                    for (int i = left; i <= right; i++) {
                        result.add(array[top][i]);
                    }
                    top++;
                    dir = 1;
                    break;

                case 1:
                    for (int i = top; i <= bottom; i++) {
                        result.add((array[i][right]));
                    }
                    right--;
                    dir = 2;
                    break;
                case 2:
                    for (int i = right; i >= left; i--) {
                        result.add(array[bottom][i]);
                    }
                    bottom--;
                    dir = 3;
                    break;

                case 3:
                    for (int i = bottom; i >= top; i--) {
                        result.add(array[i][left]);
                    }
                    left++;
                    dir = 0;
                    break;
            }
        }
        return result.stream().mapToInt(x -> x).toArray();
    }
}


