package in.ashwanik.dcp.problems.p31_60.p49;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testMaxSum() {
        assertEquals(137, new Solution().maxSum(new int[]{34, -50, 42, 14, -5, 86}));
        assertEquals(0, new Solution().maxSum(new int[]{-5, -1, -8, -9}));
    }
}
