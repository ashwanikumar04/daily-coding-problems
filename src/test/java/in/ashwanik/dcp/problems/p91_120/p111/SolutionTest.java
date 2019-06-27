package in.ashwanik.dcp.problems.p91_120.p111;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testAnagramIndices() {
        assertArrayEquals(new int[]{0, 3, 4}, new Solution().getIndices("abxaba", "ab").stream().mapToInt(x -> x).toArray());
    }
}
