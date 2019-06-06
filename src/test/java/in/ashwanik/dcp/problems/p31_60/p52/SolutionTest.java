package in.ashwanik.dcp.problems.p31_60.p52;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SolutionTest {

    @Test
    public void testLRU() {
        Solution solution = new Solution(3);
        solution.set("k1", "value1");
        assertEquals("value1", solution.get("k1"));
        solution.set("k2", "value2");
        solution.set("k3", "value3");
        solution.set("k4", "value4");
        assertNull(solution.get("k1"));
    }
}
