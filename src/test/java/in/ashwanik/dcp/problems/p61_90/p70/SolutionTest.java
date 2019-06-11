package in.ashwanik.dcp.problems.p61_90.p70;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testPerfectNumber() {
        assertEquals(19, new Solution().perfectNumber(1));
        assertEquals(28, new Solution().perfectNumber(2));
        assertEquals(55, new Solution().perfectNumber(5));
    }
}
