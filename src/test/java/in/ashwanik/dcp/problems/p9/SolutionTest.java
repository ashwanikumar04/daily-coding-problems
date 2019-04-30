package in.ashwanik.dcp.problems.p9;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testLargestSum() {
        assertEquals(0, new Solution().getLargestSum(new int[]{}));
        assertEquals(4, new Solution().getLargestSum(new int[]{2, 4}));
        assertEquals(13, new Solution().getLargestSum(new int[]{2, 4, 6, 2, 5}));
        assertEquals(10, new Solution().getLargestSum(new int[]{5, 1, 1, 5}));
    }
}
