package in.ashwanik.dcp.problems.p181_210.p195;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testCount() {
        assertEquals(15, new Solution().countNumbers(new int[][]{{1, 3, 7, 10, 15, 20},
                {2, 6, 9, 14, 22, 25},
                {3, 8, 10, 15, 25, 30},
                {10, 11, 12, 23, 30, 35},
                {20, 25, 30, 35, 40, 45}}, new int[]{1, 1}, new int[]{3, 3}));
    }
}
