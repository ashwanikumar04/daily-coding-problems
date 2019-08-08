package in.ashwanik.dcp.problems.p181_210.p182;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    void isMinimalConnected() {
        int[][] graph = new int[][]{
                {1, 2},
                {3},
                {},
                {}
        };

        assertTrue(new Solution().isMinimallyConnected(graph));

    }
}
