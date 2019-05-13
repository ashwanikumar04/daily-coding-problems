package in.ashwanik.dcp.problems.p18;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testMaxAbsoluteFilePathLength() {
        assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, new Solution().getMaximumInSubArray(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
    }
}
