package in.ashwanik.dcp.problems.p30;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testEncoded() {
        assertEquals(0, new Solution().calculateTrappedWater(new int[]{}));
        assertEquals(1, new Solution().calculateTrappedWater(new int[]{2, 1, 2}));
        assertEquals(8, new Solution().calculateTrappedWater(new int[]{3, 0, 1, 3, 0, 5}));
    }
}
