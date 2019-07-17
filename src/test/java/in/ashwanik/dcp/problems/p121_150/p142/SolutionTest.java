package in.ashwanik.dcp.problems.p121_150.p142;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    void testIsBalanced() {
        assertTrue(new Solution().isBalanced("(()*"));
        assertTrue(new Solution().isBalanced("(*)"));
        assertFalse(new Solution().isBalanced(")*("));
    }
}
