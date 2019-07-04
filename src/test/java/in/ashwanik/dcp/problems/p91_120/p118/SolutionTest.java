package in.ashwanik.dcp.problems.p91_120.p118;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testSortArray() {
        assertArrayEquals(new int[]{}, new Solution().sortArray(new int[]{}));
        assertArrayEquals(new int[]{0, 4, 4, 9, 81}, new Solution().sortArray(new int[]{-9, -2, 0, 2, 3}));
        assertArrayEquals(new int[]{0, 4, 4, 9, 81}, new Solution().sortArray(new int[]{0, 2, 2, 3, 9}));
    }
}
