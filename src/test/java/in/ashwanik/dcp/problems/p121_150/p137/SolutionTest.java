package in.ashwanik.dcp.problems.p121_150.p137;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testBitArray() {
        Solution solution = new Solution();
        solution.init(5);
        assertEquals(0, solution.get(3));
        solution.set(0, 1);
        assertEquals(1, solution.get(0));
        solution.set(1, 1);
        assertEquals(1, solution.get(1));
    }
}
