package in.ashwanik.dcp.problems.p121_150.p141;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void testStack() {

        Solution solution = new Solution(3, 6);

        solution.push(0, 5);
        solution.push(0, 6);
        solution.push(2, 7);


        assertEquals(6, solution.pop(0));
        assertEquals(5, solution.pop(0));
        assertEquals(7, solution.pop(2));


    }

}
