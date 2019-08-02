package in.ashwanik.dcp.problems.p151_180.p176;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    void testCheckOneOnOneMapping() {
        assertTrue(new Solution().checkOneToOneMapping("abc", "bcd"));
        assertFalse(new Solution().checkOneToOneMapping("foo", "bar"));
    }
}
