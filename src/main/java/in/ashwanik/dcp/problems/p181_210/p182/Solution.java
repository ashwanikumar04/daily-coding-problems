package in.ashwanik.dcp.problems.p181_210.p182;

class Solution {

    boolean isMinimallyConnected(int[][] graph) {
        if (graph == null || graph.length == 0) {
            return false;
        }
        boolean[] visited = new boolean[graph.length];

        if (!dfs(0, graph, visited)) {
            return false;
        }

        for (boolean b : visited) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(int v, int[][] graph, boolean[] visited) {
        visited[v] = true;
        for (int i : graph[v]) {
            if (!visited[i] && !dfs(i, graph, visited)) {
                return false;
            }
        }
        return true;
    }

}