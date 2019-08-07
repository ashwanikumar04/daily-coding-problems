package in.ashwanik.dcp.problems.p151_180.p178;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void testDice() {
        assertTrue(count(5, 6) < count(5, 5));
    }

    private int count(int a, int b) {
        int count = 0;
        for (int index = 0; index < 10000; index++) {
            count = solution.numberOfDiceToWin(a, b);
        }
        return count;
    }
}
