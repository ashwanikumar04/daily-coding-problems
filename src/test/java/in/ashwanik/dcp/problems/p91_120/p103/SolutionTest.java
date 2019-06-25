package in.ashwanik.dcp.problems.p91_120.p103;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testMinimumString() {
        assertEquals("aeci", new Solution().getSmallestSubstring("figehaeci", "aei"));
    }
}
