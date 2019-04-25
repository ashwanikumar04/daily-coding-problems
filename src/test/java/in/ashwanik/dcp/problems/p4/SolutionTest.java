package in.ashwanik.dcp.problems.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testProduct() {
        assertEquals(1, new Solution().missingInteger(new int[]{}));
        assertEquals(1, new Solution().missingInteger(new int[]{2, 3, 7, 6, 8, -1, -10, 15}));
        assertEquals(4, new Solution().missingInteger(new int[]{2, 3, -7, 6, 8, 1, -10, 15}));
        assertEquals(2, new Solution().missingInteger(new int[]{1, 1, 0, -1, -2}));
        assertEquals(2, new Solution().missingInteger(new int[]{3, 4, -1, 1}));
        assertEquals(3, new Solution().missingInteger(new int[]{1, 2, 0}));
    }
}
