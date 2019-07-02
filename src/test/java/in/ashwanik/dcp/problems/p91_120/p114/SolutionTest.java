package in.ashwanik.dcp.problems.p91_120.p114;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testReverseStringWithDelimiter() {
        Set<Character> set = new HashSet<>();
        set.add('/');
        set.add(':');
        assertEquals("here/world:hello", new Solution().reverseWordsWithDelimiters("hello/world:here", set));
        assertEquals("here/world:hello/", new Solution().reverseWordsWithDelimiters("hello/world:here/", set));
    }
}
