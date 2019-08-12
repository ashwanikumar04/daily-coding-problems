package in.ashwanik.dcp.problems.p181_210.p190;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testMaxSubArraySumForCircularArray() {
        assertEquals(15, new Solution().maxSubArraySum(new int[]{8, -1, 3, 4}));
        assertEquals(6, new Solution().maxSubArraySum(new int[]{-4, 5, 1, 0}));
    }
}
