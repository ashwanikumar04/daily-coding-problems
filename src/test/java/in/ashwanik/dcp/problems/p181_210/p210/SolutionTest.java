package in.ashwanik.dcp.problems.p181_210.p210;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    void testCollatzSequence() {
        assertArrayEquals(new Integer[]{}, new Solution().getCollatzSequence(0).toArray());
        assertArrayEquals(new Integer[]{1}, new Solution().getCollatzSequence(1).toArray());
        assertArrayEquals(new Integer[]{12, 6, 3, 10, 5, 16, 8, 4, 2, 1}, new Solution().getCollatzSequence(12).toArray());
    }
}
