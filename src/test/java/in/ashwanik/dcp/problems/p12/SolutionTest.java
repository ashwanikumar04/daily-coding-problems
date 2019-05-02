package in.ashwanik.dcp.problems.p12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testNumberOfWaysToClimb() {
        assertEquals(5, new Solution().numberOfWaysToClimb(4));
    }
}
