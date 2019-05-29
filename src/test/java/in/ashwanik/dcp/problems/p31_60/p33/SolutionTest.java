package in.ashwanik.dcp.problems.p31_60.p33;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void testGetMedian() {
        assertArrayEquals(new double[]{}, new Solution().getMedian(new int[]{}));
        assertArrayEquals(new double[]{2, 1.5, 2, 3.5, 2, 2, 2}, new Solution().getMedian(new int[]{2, 1, 5, 7, 2, 0, 5}));
        assertArrayEquals(new double[]{12.0, 8.0, 5.0, 4.5, 5.0, 6.0}, new Solution().getMedian(new int[]{12, 4, 5, 3, 8, 7}));
    }
}
