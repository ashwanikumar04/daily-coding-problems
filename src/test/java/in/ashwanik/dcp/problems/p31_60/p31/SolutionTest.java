package in.ashwanik.dcp.problems.p31_60.p31;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testEditDistance() {
        assertEquals(3, new Solution().editDistanceBF("kitten", "sitting"));
        assertEquals(3, new Solution().editDistance("kitten", "sitting"));

        assertEquals(3, new Solution().editDistanceBF("sunday", "saturday"));
        assertEquals(3, new Solution().editDistance("sunday", "saturday"));
    }
}
