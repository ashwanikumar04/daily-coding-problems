package in.ashwanik.dcp.problems.p151_180.p175;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    void testMarkovChain() {
        List<Solution.State> states = new ArrayList<>();
        states.add(new Solution.State("a", "a", 0.9f));
        states.add(new Solution.State("a", "b", 0.075f));
        states.add(new Solution.State("a", "c", 0.025f));
        states.add(new Solution.State("b", "a", 0.15f));
        states.add(new Solution.State("b", "b", 0.8f));
        states.add(new Solution.State("b", "c", 0.05f));
        states.add(new Solution.State("c", "a", 0.25f));
        states.add(new Solution.State("c", "b", 0.25f));
        states.add(new Solution.State("c", "c", 0.5f));
        assertTrue(new Solution().getMarkovChain(states, 5000, "a").get("a") > 3000);
    }
}
