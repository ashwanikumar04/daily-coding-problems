package in.ashwanik.dcp.problems.p91_120.p100;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testMinimumDistance() {
        assertEquals(2, new Solution().getMinimumDistance(new int[][]{{0, 0}, {1, 1}, {1, 2}}));
    }
}
