package in.ashwanik.dcp.problems.p151_180.p170.variation;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SolutionTest {

    @Test
    void testTransformation() {
        Solution solution = new Solution(new HashSet<>(Arrays.asList("dog", "dot", "dop",
                "dat", "cat")));

        assertArrayEquals(new String[]{"dog", "dot", "dat", "cat"}, solution.getTransformation("dog", "cat").toArray());
        assertNull(solution.getTransformation("dog", "mat"));
    }
}
