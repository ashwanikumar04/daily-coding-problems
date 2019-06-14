package in.ashwanik.dcp.problems.p61_90.p86;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testNumberOfParentheses() {
        assertEquals(1, new Solution().minimumNumberOfParanthesisToRemove("()())()"));
        assertEquals(2, new Solution().minimumNumberOfParanthesisToRemove(")("));
        assertEquals(4, new Solution().minimumNumberOfParanthesisToRemove("(((((()))("));
    }
}
