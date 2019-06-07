package in.ashwanik.dcp.problems.p61_90.p61;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testPower() {
        assertEquals(1024, new Solution().power(2, 10));
    }
}
