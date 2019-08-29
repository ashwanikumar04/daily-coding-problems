package in.ashwanik.dcp.problems.p211_p240.p211;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testIndices() {
        assertArrayEquals(new Integer[]{0, 7}, new Solution().getIndices("abracadabra", "abr").toArray());
    }
}
