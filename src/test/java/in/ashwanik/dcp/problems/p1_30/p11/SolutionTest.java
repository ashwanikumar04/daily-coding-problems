package in.ashwanik.dcp.problems.p1_30.p11;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.LinkedHashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testLargestSum() {
        Solution solution = new Solution();
        solution.preprocess(new LinkedHashSet<>(Arrays.asList("cat", "do", "dog", "deer", "deal")));
        assertEquals("", String.join(",", solution.search("a")));
        assertEquals("deal,deer", String.join(",", solution.search("de")));
    }
}
