package in.ashwanik.dcp.problems.p181_210.p197;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testRotateArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        new Solution().rotateArrayToRight(array, 3);
        assertArrayEquals(new int[]{6, 7, 8, 1, 2, 3, 4, 5}, array);
    }
}
