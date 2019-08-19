package in.ashwanik.dcp.problems.p181_210.p198;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    void testSubset() {
        assertArrayEquals(new Integer[]{20, 10, 5}, new Solution().getSubset(new int[]{3, 5, 10, 20, 21}).toArray());
        assertArrayEquals(new Integer[]{24, 6, 3, 1}, new Solution().getSubset(new int[]{1, 3, 6, 24}).toArray());
    }
}
