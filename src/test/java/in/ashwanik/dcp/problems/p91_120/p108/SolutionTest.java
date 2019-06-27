package in.ashwanik.dcp.problems.p91_120.p108;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    void testIsRotated() {
        assertTrue(new Solution().isRotated("abcde", "cdeab"));
        assertFalse(new Solution().isRotated("abc", "acb"));
    }
}
