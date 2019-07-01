package in.ashwanik.dcp.problems.p91_120.p113;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SolutionTest {
    @Test
    void testReverseSentence() {
        assertEquals("", new Solution().reverseWords(""));
        assertNull(new Solution().reverseWords(null));
        assertEquals("here world hello", new Solution().reverseWords("hello world here"));
        assertEquals("here world hello ", new Solution().reverseWords(" hello world here"));
    }
}
