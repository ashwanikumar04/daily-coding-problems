package in.ashwanik.dcp.problems.p151_180.p154;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testStack() {
        Solution solution = new Solution();

        solution.push(1);
        solution.push(2);
        solution.push(3);

        assertEquals(3, solution.pop());
        assertEquals(2, solution.pop());
        assertEquals(1, solution.pop());
    }
}
