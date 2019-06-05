package in.ashwanik.dcp.problems.p31_60.p46;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testPalindromicString() {
        assertEquals("bcdcb", new Solution().longestPalindromincSubstring("aabcdcb"));
        assertEquals("anana", new Solution().longestPalindromincSubstring("bananas"));
    }
}
