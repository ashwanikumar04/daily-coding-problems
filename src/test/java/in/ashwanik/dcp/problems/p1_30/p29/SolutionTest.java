package in.ashwanik.dcp.problems.p1_30.p29;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testEncoded() {
        assertEquals("4A3B2C1D2A", new Solution().encode("AAAABBBCCDAA"));
        assertEquals("ABCD", new Solution().encode("ABCD"));
        assertEquals("4w3a1d1e6x", new Solution().encode("wwwwaaadexxxxxx"));

    }
}
