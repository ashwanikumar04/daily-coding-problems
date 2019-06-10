package in.ashwanik.dcp.problems.p61_90.p66;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testFairCoin() {
        Solution solution = new Solution();
        float heads = 0, tails = 0;
        for (int i = 0; i < 2; i++) {
            if (solution.fairCoin()) {
                heads++;
            } else {
                tails++;
            }
        }
        assertEquals(.5f, heads / (heads + tails));
    }
}
