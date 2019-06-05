package in.ashwanik.dcp.problems.p31_60.p44;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testCountInversion() {
        assertEquals(3, new Solution().numberOfInversions(new int[]{2, 4, 1, 3, 5}));
        assertEquals(10, new Solution().numberOfInversions(new int[]{5, 4, 3, 2, 1}));
    }
}
