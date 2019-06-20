package in.ashwanik.dcp.problems.p91_120.p100;

class Solution {
    int getMinimumDistance(int[][] points) {
        if (points == null || points.length < 2) {
            return 0;
        }

        int distance = 0;

        for (int index = 0; index < points.length - 1; index++) {
            distance += distance(points[index], points[index + 1]);
        }

        return distance;
    }

    private int distance(int[] point1, int[] point2) {
        int x = Math.abs(point1[0] - point2[0]);
        int y = Math.abs(point1[1] - point2[1]);
        return Math.max(x, y);
    }
}