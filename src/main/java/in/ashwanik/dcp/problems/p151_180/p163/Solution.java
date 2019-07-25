package in.ashwanik.dcp.problems.p151_180.p163;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

    int evaluate(String[] notation) {

        Deque<Integer> stack = new ArrayDeque<>();
        int a;
        int b;
        for (String c : notation) {
            switch (c) {
                case "+":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a + b);
                    break;
                case "-":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b - a);
                    break;
                case "*":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(a * b);
                    break;
                case "/":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b / a);
                    break;
                default:
                    stack.push(Integer.parseInt(c));
            }
        }

        return stack.pop();
    }
}