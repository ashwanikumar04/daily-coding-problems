package in.ashwanik.dcp.problems.p61_90.p65;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void testSpiralPrint() {
        assertArrayEquals(new int[]{}, new Solution().printSpiral(new int[][]{}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 10, 15, 20, 19, 18, 17, 16, 11, 6, 7, 8, 9, 14, 13, 12}, new Solution().printSpiral(new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20}}));
    }
}
