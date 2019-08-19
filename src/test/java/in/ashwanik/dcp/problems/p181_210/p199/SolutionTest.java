package in.ashwanik.dcp.problems.p181_210.p199;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testBalancedParentheses(){
        assertEquals("(())",new Solution().getBalancedParentheses("(()"));
        assertEquals("()()()()",new Solution().getBalancedParentheses("))()("));
    }
}
