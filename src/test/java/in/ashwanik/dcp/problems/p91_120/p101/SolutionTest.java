package in.ashwanik.dcp.problems.p91_120.p101;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testPrimePair() {
        assertArrayEquals(new int[]{3, 5}, new Solution().findPrimeSumPair(8));
        assertArrayEquals(new int[]{3, 71}, new Solution().findPrimeSumPair(74));
    }
}
