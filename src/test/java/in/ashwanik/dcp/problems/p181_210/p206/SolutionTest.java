package in.ashwanik.dcp.problems.p181_210.p206;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class SolutionTest {
    @Test
    void testPermutation() {
        char[] array = {'a', 'b', 'c'};
        int[] indices = {2, 1, 0};
        new Solution().permuteArray(array, indices);
        assertArrayEquals(new char[]{'c', 'b', 'c'}, array);
    }
}
