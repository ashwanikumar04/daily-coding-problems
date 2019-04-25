package in.ashwanik.dcp.problems.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class SolutionTest {
    @Test
    void testSumExistsForNull() {
        int[] array = null;
        assertFalse(new Solution().sumExists(array, 5));
    }

    @Test
    void testSumExistsTrue() {
        int[] array = {10, 5};
        assertFalse(new Solution().sumExists(array, 10));
    }
}
