package in.ashwanik.dcp.problems.p121_p150.p136;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testMaximumAreas1(){
        assertEquals(4, new Solution().areaWithMaximum1(new int[][]{{1, 0, 0, 0},
                {1, 0, 1, 1},
                {1, 0, 1, 1},
                {0, 1, 0, 0}}));
    }
}
