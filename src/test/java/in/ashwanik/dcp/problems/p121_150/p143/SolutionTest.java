package in.ashwanik.dcp.problems.p121_150.p143;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testPartition() {
        int[] array = new int[]{9, 12, 3, 5, 14, 10, 10};
        new Solution().partition(array, 10);
        assertArrayEquals(new int[]{9, 3, 5, 10, 10, 14, 12}, array);
    }
}

