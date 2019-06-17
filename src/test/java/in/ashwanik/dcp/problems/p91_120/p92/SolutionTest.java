package in.ashwanik.dcp.problems.p91_120.p92;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testCourseOrder() {
        Map<String, List<String>> data = new HashMap<>();

        data.put("CSC300", Arrays.asList("CSC100", "CSC200"));
        data.put("CSC200", Collections.singletonList("CSC100"));
        data.put("CSC100", new ArrayList<>());

        assertArrayEquals(new String[]{"CSC100", "CSC200", "CSC300"}, new Solution().getSortedCourse(data).toArray());
    }
}
