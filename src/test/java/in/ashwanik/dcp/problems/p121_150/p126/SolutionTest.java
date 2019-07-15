package in.ashwanik.dcp.problems.p121_150.p126;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testRotateArray() {
        int[] array = new int[]{1, 2, 3, 4, 5, 6};
        new Solution().rotateArray(array, 2);
        assertArrayEquals(new int[]{3, 4, 5, 6, 1, 2}, array);
    }
}
