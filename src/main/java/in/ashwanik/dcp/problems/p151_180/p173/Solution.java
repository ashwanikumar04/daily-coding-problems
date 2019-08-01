package in.ashwanik.dcp.problems.p151_180.p173;

import java.util.LinkedHashMap;
import java.util.Map;

class Solution {
    Map<String, Integer> flattenMap(Map<String, Object> map) {
        Map<String, Integer> flattenedMap = new LinkedHashMap<>();
        if (map == null || map.isEmpty()) {
            return flattenedMap;
        }
        flattenHelper(flattenedMap, map, "");
        return flattenedMap;
    }

    private void flattenHelper(Map<String, Integer> flattenedMap, Map<String, Object> map, String parent) {

        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = parent.isEmpty() ? entry.getKey() : parent + "." + entry.getKey();

            if (entry.getValue() instanceof Integer) {
                flattenedMap.put(key, (Integer) entry.getValue());

            } else {
                flattenHelper(flattenedMap, (Map<String, Object>) entry.getValue(), key);
            }
        }
    }
}