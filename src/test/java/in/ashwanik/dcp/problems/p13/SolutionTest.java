package in.ashwanik.dcp.problems.p13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testLongestStringWithDistinctCharacter() {
        assertEquals(3, new Solution().longestSubstringWithDistinctCharacters("abcba",2));
        assertEquals(4, new Solution().longestSubstringWithDistinctCharacters("araaci",2));
        assertEquals(2, new Solution().longestSubstringWithDistinctCharacters("araaci",1));
        assertEquals(5, new Solution().longestSubstringWithDistinctCharacters("cbbebi",3));
    }
}
