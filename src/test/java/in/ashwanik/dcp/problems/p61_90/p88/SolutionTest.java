package in.ashwanik.dcp.problems.p61_90.p88;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testDivision() {
        assertEquals(2, new Solution().divideWithoutDivision(10, 5));
        assertEquals(3, new Solution().divideWithoutDivision(16, 5));
        assertEquals(-5, new Solution().divideWithoutDivision(27, -5));
    }
}
