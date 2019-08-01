package in.ashwanik.dcp.problems.p151_180.p172;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testGetIndices() {
        assertArrayEquals(new Integer[]{0, 13}, new Solution().getIndices("dogcatcatcodecatdog", Arrays.asList("cat", "dog")).toArray());
    }
}
