package in.ashwanik.dcp.problems.p16;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testLog() {
        Solution solution = new Solution(5);
        solution.record(1);
        solution.record(2);
        solution.record(3);
        solution.record(4);
        assertEquals(2, solution.getLast(3));
    }
}
