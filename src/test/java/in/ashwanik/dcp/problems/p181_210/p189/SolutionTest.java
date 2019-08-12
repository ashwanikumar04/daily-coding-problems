package in.ashwanik.dcp.problems.p181_210.p189;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testMaxDistinctSubArray() {
        assertEquals(5, new Solution().maxDistinctLength(new int[]{5, 1, 3, 5, 2, 3, 4, 1}));
    }
}
