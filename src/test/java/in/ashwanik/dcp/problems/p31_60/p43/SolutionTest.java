package in.ashwanik.dcp.problems.p31_60.p43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SolutionTest {
    @Test
    void testStack() {
        Solution solution = new Solution();
        assertNull(solution.max());
        assertNull(solution.pop());

        solution.push(2);
        solution.push(2);
        solution.push(10);
        solution.push(13);
        solution.push(1);
        solution.push(5);
        solution.push(14);

        assertEquals(14, solution.max());
        assertEquals(14, solution.pop());

        assertEquals(13, solution.max());
        assertEquals(5, solution.pop());

        assertEquals(13, solution.max());
        assertEquals(1, solution.pop());

        assertEquals(13, solution.max());
        assertEquals(13, solution.pop());

        assertEquals(10, solution.max());
        assertEquals(10, solution.pop());

        assertEquals(2, solution.max());
        assertEquals(2, solution.pop());

        assertEquals(2, solution.max());
        assertEquals(2, solution.pop());

        assertNull(solution.max());
        assertNull(solution.pop());
    }
}