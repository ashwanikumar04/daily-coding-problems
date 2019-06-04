package in.ashwanik.dcp.problems.p31_60.p43;

import java.util.Stack;

class Solution {


    private Stack<Integer> main;
    private Stack<Integer> max;

    public Solution() {
        main = new Stack<>();
        max = new Stack<>();
    }

    public void push(int value) {
        main.push(value);
        if (max.isEmpty() || max.peek() < value || max.peek() == value) {
            max.push(value);
        }
    }

    public Integer pop() {
        if (main.isEmpty()) {
            return null;
        }
        Integer value = main.pop();
        if (max.peek().equals(value)) {
            max.pop();
        }
        return value;
    }

    public Integer max() {
        return max.isEmpty() ? null : max.peek();
    }
}


