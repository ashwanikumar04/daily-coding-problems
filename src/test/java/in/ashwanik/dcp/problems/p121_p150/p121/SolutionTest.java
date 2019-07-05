package in.ashwanik.dcp.problems.p121_p150.p121;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    void testIsAtMostKPalindrome(){
        assertTrue(new Solution().isAtMostKPalindrome("waterrfetawx",2));
        assertTrue(new Solution().isAtMostKPalindrome("abcdecba",1));
    }
}
