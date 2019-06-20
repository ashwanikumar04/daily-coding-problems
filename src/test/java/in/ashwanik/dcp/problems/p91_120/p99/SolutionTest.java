package in.ashwanik.dcp.problems.p91_120.p99;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testLength() {
        assertEquals(4, new Solution().getLongestConsecutiveSequenceLength(new int[]{100, 4, 200, 1, 3, 2}));
    }
}
