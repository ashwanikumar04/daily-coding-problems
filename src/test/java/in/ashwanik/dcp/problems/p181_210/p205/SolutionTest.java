package in.ashwanik.dcp.problems.p181_210.p205;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testNextNumber() {
        int[] array = {4, 8, 9, 7, 5};
        new Solution().nextNumber(array);
        assertArrayEquals(new int[]{4, 9, 5, 7, 8}, array);

        array = new int[]{2, 1, 8, 7, 6, 5};
        new Solution().nextNumber(array);
        assertArrayEquals(new int[]{2, 5, 1, 6, 7, 8}, array);
    }
}
