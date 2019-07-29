package in.ashwanik.dcp.problems.p151_180.p168;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testRotateMatrix() {
        int[][] array = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] expected = new int[][]{{7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}};

        new Solution().rotate(array);

        for (int index = 0; index < array.length; index++) {
            assertArrayEquals(expected[index], array[index]);
        }

    }
}
