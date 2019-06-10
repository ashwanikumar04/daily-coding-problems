package in.ashwanik.dcp.problems.p61_90.p67;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SolutionTest {
    @Test
    void testLFU() {
        Solution solution = new Solution(4);
        solution.put("A", "1");
        assertEquals("1", solution.get("A"));
        solution.put("B", "2");
        solution.put("C", "3");
        solution.put("D", "4");

        solution.get("B");
        solution.get("C");
        solution.get("B");
        solution.get("B");
        solution.get("B");
        solution.get("B");
        solution.get("B");
        solution.put("E", "4");

        assertNull(solution.get("D"));

    }
}
