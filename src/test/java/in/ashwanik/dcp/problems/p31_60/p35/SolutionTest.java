package in.ashwanik.dcp.problems.P31_60.p35;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {

    @Test
    void testSort() {
        assertArrayEquals(new char[]{'R', 'R', 'R', 'G', 'G', 'B', 'B'}, new Solution().sort(new char[]{'G', 'B', 'R', 'R', 'B', 'R', 'G'}));
    }
}
