package in.ashwanik.dcp.problems.p7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testCount() {
        assertEquals(3, new Solution().countOfDecoding("111"));
        assertEquals(3, new Solution().countOfDecoding("1234"));
    }
}
