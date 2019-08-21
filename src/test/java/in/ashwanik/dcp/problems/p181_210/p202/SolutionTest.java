package in.ashwanik.dcp.problems.p181_210.p202;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    void testIsPalindrome() {
        assertTrue(new Solution().isPalindrom(12321));
        assertFalse(new Solution().isPalindrom(1234));
    }
}
