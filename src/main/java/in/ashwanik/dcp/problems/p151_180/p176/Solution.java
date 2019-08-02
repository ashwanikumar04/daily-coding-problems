package in.ashwanik.dcp.problems.p151_180.p176;

import java.util.Arrays;

class Solution {
    boolean checkOneToOneMapping(String first, String second) {
        if (first == null) {
            return second == null || second.isEmpty();
        }

        if (second == null) {
            return first.isEmpty();
        }

        if (first.length() != second.length()) {
            return false;
        }

        int m = first.length();

        boolean[] visited = new boolean[256];
        int[] mapping = new int[256];
        Arrays.fill(mapping, -1);

        for (int index = 0; index < m; index++) {
            if (mapping[first.charAt(index)] == -1) {
                if (visited[second.charAt(index)]) {
                    return false;
                }
                visited[second.charAt(index)] = true;
                mapping[first.charAt(index)] = second.charAt(index);
            } else if (mapping[first.charAt(index)] != second.charAt(index)) {
                return false;
            }
        }
        return true;
    }
}