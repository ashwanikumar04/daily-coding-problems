package in.ashwanik.dcp.problems.p1_30.p23;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testGetMinimumSteps() {

        boolean[][] matrix = {{true, true, true, true},
                {false, false, true, false},
                {true, true, true, true},
                {true, true, true, true}};

        Solution.Point start = new Solution.Point(3, 0);
        Solution.Point end = new Solution.Point(0, 0);


        assertEquals(7, new Solution().getMinimumNumberOfSteps(matrix, start, end));
    }
}
