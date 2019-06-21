package in.ashwanik.dcp.problems.p91_120.p102;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testSumSubArray() {
        assertArrayEquals(new int[]{2, 3, 4}, new Solution().getContinuousArray(new int[]{1, 2, 3, 4, 5}, 9));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, new Solution().getContinuousArray(new int[]{1, 2, 3, 4, 5}, 15));
        assertArrayEquals(new int[]{}, new Solution().getContinuousArray(new int[]{1, 2, 3, 4, 5}, 20));
    }
}
