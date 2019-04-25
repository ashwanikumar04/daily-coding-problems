package in.ashwanik.dcp.problems.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testProduct() {
        int[] array = {3, 2, 1};
        int[] result = new Solution().product(array);
        assertEquals(2, result[0]);
        assertEquals(3, result[1]);
        assertEquals(6, result[2]);
    }
}
