package in.ashwanik.dcp.problems.p91_120.p92;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {

    List<String> getSortedCourse(Map<String, List<String>> data) {
        if (data == null || data.isEmpty()) {
            return null;
        }


        Deque<String> stack = new ArrayDeque<>();
        Set<String> visited = new HashSet<>();
        Set<String> visiting = new HashSet<>();

        for (Map.Entry<String, List<String>> entry : data.entrySet()) {
            if (!visited.contains(entry.getKey())) {
                if (!dfs(data, entry.getKey(), entry.getValue(), stack, visited, visiting)) {
                    return null;
                }
            }
        }

        List<String> order = new ArrayList<>();
        while (!stack.isEmpty()) {
            order.add(0, stack.pop());
        }
        return order;
    }

    private boolean dfs(Map<String, List<String>> data, String key, List<String> value, Deque<String> stack, Set<String> visited, Set<String> visiting) {
        if (visited.contains(key)) {
            return true;
        }
        visiting.add(key);
        for (String c : value) {
            if (visiting.contains(c)) {
                return false;
            }
            if (!visited.contains(c)) {
                if (!(dfs(data, c, data.get(c), stack, visited, visiting))) {
                    return false;
                }
            }
        }
        visiting.remove(key);
        visited.add(key);
        stack.push(key);
        return true;
    }
}