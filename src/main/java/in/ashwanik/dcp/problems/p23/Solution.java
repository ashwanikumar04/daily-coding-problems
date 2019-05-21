package in.ashwanik.dcp.problems.p23;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

    private int[] X = {-1, 0, 1, 0};
    private int[] Y = {0, 1, 0, -1};


    int getMinimumNumberOfSteps(boolean[][] matrix, Point start, Point end) {

        if (!matrix[start.x][start.y] || !matrix[end.x][end.y]) {
            return -1;
        }

        Deque<QNode> queue = new ArrayDeque<>();

        QNode startNode = new QNode();
        startNode.distance = 0;
        startNode.point = start;

        queue.add(startNode);

        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        visited[start.x][start.y] = true;

        while (!queue.isEmpty()) {
            QNode current = queue.getFirst();
            if (current.point.x == end.x && current.point.y == end.y) {
                return current.distance;
            }
            for (int index = 0; index < 4; index++) {
                Point neighbour = new Point(current.point.x + X[index], current.point.y + Y[index]);
                if (isValid(neighbour, matrix.length, matrix[0].length) &&
                        matrix[neighbour.x][neighbour.y] &&
                        !visited[neighbour.x][neighbour.y]) {

                    QNode neighbourNode = new QNode();
                    neighbourNode.distance = current.distance + 1;
                    neighbourNode.point = neighbour;
                    visited[neighbour.x][neighbour.y] = true;
                    queue.add(neighbourNode);
                }
            }

        }
        return -1;
    }


    private boolean isValid(Point point, int m, int n) {
        return point.x >= 0 && point.x < m && point.y >= 0 && point.y < n;
    }

    static class QNode {
        int distance;
        Point point;
    }

    static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }
}


