package in.ashwanik.dcp.problems.p61_90.p90;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    void testRandom() {
        Solution solution = new Solution(1000000000, new int[]{640145908});

        assertTrue(solution.pick() != 640145908);

    }
}
