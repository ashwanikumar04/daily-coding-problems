package in.ashwanik.dcp.problems.p151_180.p157;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    void testIsPalindrome() {
        assertAll("Is String palindrome", () -> assertTrue(new Solution().isPalindrome("carrace")),
                () -> assertFalse(new Solution().isPalindrome("daily")));

    }
}
