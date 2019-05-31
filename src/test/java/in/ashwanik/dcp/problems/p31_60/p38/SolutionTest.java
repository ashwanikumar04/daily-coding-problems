package in.ashwanik.dcp.problems.p31_60.p38;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testNumberOfSolutions() {
        assertEquals(2, new Solution().numberOfSolutions(4));
        assertEquals(10, new Solution().numberOfSolutions(5));
        assertEquals(4, new Solution().numberOfSolutions(6));
        assertEquals(92, new Solution().numberOfSolutions(8));
    }
}
