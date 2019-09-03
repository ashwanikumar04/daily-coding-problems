package in.ashwanik.dcp.problems.p211_p240.p216;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testRomanToDecimal() {
        Solution solution = new Solution();
        assertEquals(4, solution.convertRomanToDecimal("IV"));
        assertEquals(40, solution.convertRomanToDecimal("XL"));
        assertEquals(14, solution.convertRomanToDecimal("XIV"));
        assertEquals( 1904, solution.convertRomanToDecimal("MCMIV"));
    }
}
