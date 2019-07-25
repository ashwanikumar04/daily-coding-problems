package in.ashwanik.dcp.problems.p151_180.p163;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void testEvaluate() {
        assertEquals(5, new Solution().evaluate(new String[]{"15", "7", "1", "1", "+", "-", "/", "3", "*", "2", "1", "1", "+", "+", "-"}));
    }
}
