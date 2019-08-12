package in.ashwanik.dcp.problems.p181_210.p191;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testIntervalsToRemove() {
        assertEquals(1, new Solution().minimumNumberOfIntervalsToRemove(new int[][]{{7, 9}, {2, 4}, {5, 8}}));
        assertEquals(0, new Solution().minimumNumberOfIntervalsToRemove(new int[][]{{0, 1}, {1, 2}}));

    }
}
