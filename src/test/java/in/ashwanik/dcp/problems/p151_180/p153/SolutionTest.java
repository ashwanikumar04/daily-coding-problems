package in.ashwanik.dcp.problems.p151_180.p153;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testMinimumDistance() {
        assertEquals(2, new Solution().minimumDistanceBetweenWords("dog cat hello cat dog dog hello cat world",
                "hello", "world"));
    }
}
