package in.ashwanik.dcp.problems.p91_120.p95;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testNextMinimum() {
        assertArrayEquals(new int[]{}, new Solution().getNextNumber(new int[]{}));
        assertArrayEquals(new int[]{1}, new Solution().getNextNumber(new int[]{1}));
        assertArrayEquals(new int[]{2, 1}, new Solution().getNextNumber(new int[]{1, 2}));
        assertArrayEquals(new int[]{1, 3, 2}, new Solution().getNextNumber(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{2, 1, 3}, new Solution().getNextNumber(new int[]{1, 3, 2}));
        assertArrayEquals(new int[]{1, 2, 3}, new Solution().getNextNumber(new int[]{3, 2, 1}));
        assertArrayEquals(new int[]{2, 5, 1, 6, 7, 8}, new Solution().getNextNumber(new int[]{2, 1, 8, 7, 6, 5}));
        assertArrayEquals(new int[]{1, 2, 3, 4}, new Solution().getNextNumber(new int[]{4, 3, 2, 1}));
        assertArrayEquals(new int[]{5, 3, 6, 4, 7, 9}, new Solution().getNextNumber(new int[]{5, 3, 4, 9, 7, 6}));
    }
}
