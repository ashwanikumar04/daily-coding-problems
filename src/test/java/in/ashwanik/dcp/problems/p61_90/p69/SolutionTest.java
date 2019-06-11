package in.ashwanik.dcp.problems.p61_90.p69;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testMaxMultiplication() {
        assertEquals(-10 * -10 * 5, new Solution().maxMultiplication(new int[]{-10, -10, 5, 2}));
        assertEquals(-4 * -8 * 9, new Solution().maxMultiplication(new int[]{-4, 1, -8, 9, 6}));
    }
}
