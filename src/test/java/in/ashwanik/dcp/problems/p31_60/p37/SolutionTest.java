package in.ashwanik.dcp.problems.p31_60.p37;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testPowerSet() {
        List<String> data = Arrays.asList("", "1", "2", "3", "1,2", "1,3", "2,3", "1,2,3");
        data.sort(String::compareTo);
        assertArrayEquals(data.toArray(), new Solution().powerSet(Arrays.asList(1, 2, 3)).toArray());
    }
}
