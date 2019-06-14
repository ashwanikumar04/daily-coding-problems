package in.ashwanik.dcp.problems.p61_90.p81;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testCombination() {
        assertArrayEquals(new String[]{"ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"}, new Solution().getCombinations("23").toArray());
    }
}
