package in.ashwanik.dcp.problems.p31_60.p60;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    @Test
    public void testEqualSet() {
        assertTrue(new Solution().equalSumSubset(new int[]{15, 5, 20, 10, 35, 15, 10}));
        assertFalse(new Solution().equalSumSubset(new int[]{15, 5, 20, 10, 35}));
    }
}
