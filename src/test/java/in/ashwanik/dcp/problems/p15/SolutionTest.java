package in.ashwanik.dcp.problems.p15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testGetRandom() {
        assertEquals(2, new Solution().getRandom(2));
    }
}
