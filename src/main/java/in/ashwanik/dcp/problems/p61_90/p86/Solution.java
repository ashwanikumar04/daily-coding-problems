package in.ashwanik.dcp.problems.p61_90.p86;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

    int minimumNumberOfParanthesisToRemove(String parentheses) {
        int count = 0;
        if (parentheses == null || parentheses.isEmpty()) {
            return count;
        }

        Deque<Character> stack = new ArrayDeque<>();

        for (char c : parentheses.toCharArray()) {
            if (c == ')') {
                if (!stack.isEmpty() && stack.peek().equals('(')) {
                    stack.pop();
                } else {
                    count++;
                }
            } else {
                stack.push(c);
            }
        }
        return count + stack.size();
    }
}