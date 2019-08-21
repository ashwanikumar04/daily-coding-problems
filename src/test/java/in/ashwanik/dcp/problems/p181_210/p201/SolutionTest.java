package in.ashwanik.dcp.problems.p181_210.p201;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testMaxSum() {
        assertEquals(9, new Solution().maxSum(new int[][]{{1}, {2, 3}, {1, 5, 1}}));
        assertEquals(23, new Solution().maxSum(new int[][]{{3}, {7, 4}, {2, 4, 6}, {8, 5, 9, 3}}));
    }
}
