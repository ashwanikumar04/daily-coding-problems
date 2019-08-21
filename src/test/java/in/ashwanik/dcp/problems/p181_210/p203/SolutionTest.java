package in.ashwanik.dcp.problems.p181_210.p203;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testGetMinimum() {
        assertEquals(3, new Solution().getMinimum(new int[]{5, 7, 10, 3, 4}));
        assertEquals(3, new Solution().getMinimum(new int[]{10, 3, 4, 5, 6, 7, 8}));
        assertEquals(3, new Solution().getMinimum(new int[]{5, 7, 10, 17, 17, 18, 3, 4}));
    }
}
