package in.ashwanik.dcp.problems.p181_210.p184;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testGCD() {
        assertEquals(14, new Solution().gcd(new int[]{42, 56, 14}));
    }
}