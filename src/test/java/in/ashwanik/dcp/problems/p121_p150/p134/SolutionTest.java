package in.ashwanik.dcp.problems.p121_p150.p134;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SolutionTest {

    @Test
    void testSparseArray() {
        Solution solution = new Solution();
        solution.init(new Integer[]{1, null, 3, null, null}, 5);
        assertNull(solution.get(4));
        solution.set(3, 90);
        assertEquals(90, solution.get(3));
    }

}
