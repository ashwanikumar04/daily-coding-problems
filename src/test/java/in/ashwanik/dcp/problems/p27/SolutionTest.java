package in.ashwanik.dcp.problems.p27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void testValidBrackets() {
        assertTrue(new Solution().checkIfBracketsAreBalanced("{}"));
        assertFalse(new Solution().checkIfBracketsAreBalanced("{)"));
        assertFalse(new Solution().checkIfBracketsAreBalanced("}{"));
        assertTrue(new Solution().checkIfBracketsAreBalanced("([])[]({})"));
        assertFalse(new Solution().checkIfBracketsAreBalanced("([)]"));
        assertFalse(new Solution().checkIfBracketsAreBalanced("((()"));
        assertFalse(new Solution().checkIfBracketsAreBalanced("{(([])[])[]]}"));
    }
}
