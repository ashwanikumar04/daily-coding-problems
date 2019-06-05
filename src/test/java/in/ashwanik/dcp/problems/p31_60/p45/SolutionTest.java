package in.ashwanik.dcp.problems.p31_60.p45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    public void testRand7() {
        assertTrue(new Solution().rand7() < 8);
    }
}
