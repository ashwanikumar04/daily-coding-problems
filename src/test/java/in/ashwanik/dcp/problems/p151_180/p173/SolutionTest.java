package in.ashwanik.dcp.problems.p151_180.p173;

import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testFlattenMap() {

        Map<String, Object> map = new LinkedHashMap<>();
        map.put("key", 3);
        Map<String, Object> childMap1 = new LinkedHashMap<>();
        childMap1.put("a", 5);
        Map<String, Object> childMap2 = new LinkedHashMap<>();
        childMap2.put("baz", 8);
        childMap1.put("bar", childMap2);
        map.put("foo", childMap1);


        Map<String, Integer> result = new LinkedHashMap<>();
        result.put("key", 3);
        result.put("foo.a", 5);
        result.put("foo.bar.baz", 8);


        assertEquals(result, new Solution().flattenMap(map));
    }
}
