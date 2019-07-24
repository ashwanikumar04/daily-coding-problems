package in.ashwanik.dcp.problems.p151_180.p155;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testGetMajorityElement() {
        assertEquals(1, new Solution().getMajorityElement(new int[]{1, 2, 1, 1, 3, 4, 0}));
    }
}
