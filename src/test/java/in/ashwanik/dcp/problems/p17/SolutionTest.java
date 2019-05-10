package in.ashwanik.dcp.problems.p17;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testMaxAbsoluteFilePathLength() {
        assertEquals(5, new Solution().maxAbsoluteFilePathLength("a.txt"));
        assertEquals(32, new Solution().maxAbsoluteFilePathLength("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext"));
    }
}
