package in.ashwanik.dcp.problems.p31_60.p41;

import java.util.*;

class Solution {
    List<String> getItinerary(String[][] tickets, String start) {
        if (tickets == null || tickets.length == 0) {
            return null;
        }
        Map<String, PriorityQueue<String>> map = new HashMap<>();
        Set<String> unique = new HashSet<>();
        for (String[] ticket : tickets) {
            map.putIfAbsent(ticket[0], new PriorityQueue<>());
            map.get(ticket[0]).add(ticket[1]);
            unique.add(ticket[0]);
            unique.add(ticket[1]);
        }

        List<String> result = new ArrayList<>();
        visit(start, map, result);
        if (result.size() < unique.size()) {
            return null;
        }
        return result;
    }

    private void visit(String start, Map<String, PriorityQueue<String>> map, List<String> result) {
        PriorityQueue<String> queue = map.get(start);
        if (queue != null && !queue.isEmpty()) {
            visit(queue.poll(), map, result);
        }
        result.add(0, start);
    }
}


