package in.ashwanik.dcp.problems.p91_120.p97;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SolutionTest {
    @Test
    void testMap() {
        Solution solution = new Solution();
        solution.set(1, 1, 0);
        solution.set(1, 2, 2);
        assertEquals(1, solution.get(1, 1));
        assertEquals(2, solution.get(1, 3));
        solution.clear();
        solution.set(1, 1, 5);
        assertNull(solution.get(1, 0));
        assertEquals(1, solution.get(1, 10));
        solution.clear();
        solution.set(1, 1, 0);
        solution.set(1, 2, 0);
        assertEquals(2, solution.get(1, 0));
    }
}
