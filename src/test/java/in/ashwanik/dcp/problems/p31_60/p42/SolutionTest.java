package in.ashwanik.dcp.problems.p31_60.p42;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testSubset() {
        List<Integer> data = Arrays.asList(12, 9, 2, 1);
        data.sort(Integer::compareTo);
        List<Integer> result = new Solution().getSubset(new int[]{12, 1, 61, 5, 9, 2}, 24);
        result.sort(Integer::compareTo);
        assertArrayEquals(data.toArray(), result.toArray());
    }
}