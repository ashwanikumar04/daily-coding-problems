package in.ashwanik.dcp.problems.p121_150.p150;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testKNearestPoints() {
        int[][] output = new int[][]{{3, 1}, {0, 0}};
        List<int[]> result = new Solution().KNearestPoints(new int[][]{{0, 0}, {5, 4}, {3, 1}}, new int[]{1, 2}, 2);
        assertEquals(output.length, result.size());
        assertArrayEquals(output[0], result.get(0));
        assertArrayEquals(output[1], result.get(1));
    }
}
