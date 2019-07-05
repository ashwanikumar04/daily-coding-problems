package in.ashwanik.dcp.problems.p91_120.p119;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testMinimumSet() {
        assertArrayEquals(new int[]{3, 6}, new Solution().minimumIntervalSet(new int[][]{{0, 3}, {2, 6}, {3, 4}, {6, 9}}));
        assertArrayEquals(new int[]{10, 10}, new Solution().minimumIntervalSet(new int[][]{{10, 20}, {10, -20}}));

    }
}