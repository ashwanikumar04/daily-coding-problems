package in.ashwanik.dcp.problems.p61_90.p77;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testMergeInterval() {
        List<int[]> intervals = Arrays.asList(new int[]{1, 3}, new int[]{5, 8}, new int[]{4, 10}, new int[]{20, 25});

        List<int[]> result = new Solution().mergeIntervals(intervals);
        assertArrayEquals(new int[]{1, 3}, result.get(0));
        assertArrayEquals(new int[]{4, 10}, result.get(1));
        assertArrayEquals(new int[]{20, 25}, result.get(2));
    }
}
