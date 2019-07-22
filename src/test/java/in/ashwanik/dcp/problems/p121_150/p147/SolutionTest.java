package in.ashwanik.dcp.problems.p121_150.p147;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    void testPancakeSort() {
        Solution solution = new Solution();
        int[] array = new int[]{9, 10, 1, 8, 2, 3};
        solution.pancakeSort(array);

        assertArrayEquals(new int[]{1, 2, 3, 8, 9, 10}, array);
    }
}
