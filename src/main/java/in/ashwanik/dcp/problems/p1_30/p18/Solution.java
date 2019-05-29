package in.ashwanik.dcp.problems.p1_30.p18;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {

    int[] getMaximumInSubArray(int[] array, int window) {
        List<Integer> result = new ArrayList<>();
        if (array == null || array.length == 0) {
            return new int[0];
        }
        if (window > array.length) {
            throw new IllegalArgumentException("window should be less than the array length");
        }

        Deque<Integer> deque = new ArrayDeque<>();
        for (int index = 0; index < array.length; index++) {
            if (!deque.isEmpty() && deque.peekFirst() == index - window) {
                deque.removeFirst();
            }
            while (!deque.isEmpty() && array[index] > array[deque.peekLast()]) {
                deque.removeLast();
            }

            deque.addLast(index);
            if (index >= window - 1) {
                result.add(array[deque.peekFirst()]);
            }
        }
        return result.stream().mapToInt(x -> x).toArray();
    }
}


