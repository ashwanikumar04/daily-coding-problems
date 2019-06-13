package in.ashwanik.dcp.problems.p61_90.p79;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    void testCanSort() {

        assertTrue(new Solution().canBeSorted(new int[]{4, 2, 3}));
        assertFalse(new Solution().canBeSorted(new int[]{4, 2, 1}));

        assertTrue(new Solution().canBeSorted(new int[]{10, 5, 7}));
        assertFalse(new Solution().canBeSorted(new int[]{10, 5, 1}));

    }
}
