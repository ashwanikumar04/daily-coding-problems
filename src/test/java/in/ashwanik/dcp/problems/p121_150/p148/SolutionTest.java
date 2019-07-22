package in.ashwanik.dcp.problems.p121_150.p148;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testGrayCode() {
        assertArrayEquals(new Integer[]{0, 1, 3, 2}, new Solution().grayCode(2).toArray());
    }
}
