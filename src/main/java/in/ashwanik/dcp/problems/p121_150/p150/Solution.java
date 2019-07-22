package in.ashwanik.dcp.problems.p121_150.p150;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Solution {

    List<int[]> kNearestPoints(int[][] points, int[] origin, int k) {
        if (points == null || points.length == 0) {
            return null;
        }
        List<int[]> nearestPoints = new ArrayList<>();
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((o1, o2) -> distance(o2, origin) - distance(o1, origin));
        for (int[] point : points) {
            priorityQueue.add(point);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        while (!priorityQueue.isEmpty()) {
            nearestPoints.add(priorityQueue.poll());
        }
        return nearestPoints;
    }

    private int distance(int[] point, int[] origin) {
        return (point[0] - origin[0]) * (point[0] - origin[0]) + (point[1] - origin[1]) * (point[1] - origin[1]);
    }
}