package in.ashwanik.dcp.problems.p121_p150.p129;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testSqrt() {
        assertEquals(3, new Solution().sqrt(9));
        assertEquals(4, new Solution().sqrt(16));
        assertEquals(4, new Solution().sqrt(18));
    }
}
