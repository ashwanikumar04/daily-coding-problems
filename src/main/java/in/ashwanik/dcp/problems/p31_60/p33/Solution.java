package in.ashwanik.dcp.problems.p31_60.p33;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {

    double[] getMedian(int[] array) {
        if (array == null || array.length == 0) {
            return new double[0];
        }

        double[] median = new double[array.length];
        Queue<Integer> left = new PriorityQueue<>(Comparator.reverseOrder());
        Queue<Integer> right = new PriorityQueue<>();


        for (int index = 0; index < array.length; index++) {
            if (index == 0) {
                median[0] = array[0];
                left.add(array[0]);
            } else {
                if (array[index] > left.peek()) {
                    right.add(array[index]);
                } else {
                    left.add(array[index]);
                }
                if (left.size() > right.size()) {
                    right.add(left.poll());
                } else if (left.size() < right.size()) {
                    left.add(right.poll());
                }

                if (right.size() == left.size()) {
                    median[index] = (double) (right.peek() + left.peek()) / 2.0;
                } else {
                    if (left.size() > right.size()) {
                        median[index] = left.peek();
                    } else {
                        median[index] = right.peek();
                    }
                }
            }
        }
        return median;
    }
}


