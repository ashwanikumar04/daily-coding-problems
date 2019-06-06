package in.ashwanik.dcp.problems.p31_60.p53;

import java.util.Stack;

class Solution {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public Solution() {
        first = new Stack<>();
        second = new Stack<>();
    }

    void enqueue(Integer value) {
        first.push(value);
    }

    Integer dequeue() {
        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.pop());
            }
        }
        if (second.isEmpty()) {
            return null;
        }
        return second.pop();
    }
}


