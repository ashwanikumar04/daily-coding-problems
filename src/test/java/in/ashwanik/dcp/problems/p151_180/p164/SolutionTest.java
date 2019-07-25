package in.ashwanik.dcp.problems.p151_180.p164;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void testGetDuplicateNumber() {
        assertEquals(5, new Solution().getDuplicateNumber(new int[]{1, 2, 3, 4, 5, 5}, 5));
        assertEquals(2, new Solution().getDuplicateNumber(new int[]{1, 2, 3, 4, 2, 5}, 5));
    }
}
