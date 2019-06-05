package in.ashwanik.dcp.problems.p31_60.p47;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testMaxProfit() {
        assertEquals(5, new Solution().maxProfit(new int[]{9, 11, 8, 5, 7, 10}));
    }
}
