package in.ashwanik.dcp.problems.p61_90.p84;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testNumberOfIsland() {
        assertEquals(0, new Solution().numberOfIslands(new boolean[][]{}));
        assertEquals(4, new Solution().numberOfIslands(new boolean[][]{{true, false, false, false, false},
                {false, false, true, true, false},
                {false, true, true, false, false},
                {false, false, false, false, false},
                {true, true, false, false, true},
                {true, true, false, false, true}}));
    }
}
