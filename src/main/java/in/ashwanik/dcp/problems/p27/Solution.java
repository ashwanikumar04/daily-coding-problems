package in.ashwanik.dcp.problems.p27;

import java.util.*;

class Solution {

    boolean checkIfBracketsAreBalanced(String data) {
        Map<Character, Character> openBrackets;
        Set<Character> brackets;
        openBrackets = new HashMap<>();
        openBrackets.put('{', '}');
        openBrackets.put('[', ']');
        openBrackets.put('(', ')');

        brackets = new HashSet<>();
        brackets.addAll(Arrays.asList('(', ')', '{', '}', '[', ']'));
        if (data == null || data.isEmpty()) {
            return true;
        }
        Deque<Character> stack = new ArrayDeque<>();

        for (Character c : data.toCharArray()) {
            if (brackets.contains(c)) {
                if (openBrackets.containsKey(c)) {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    Character last = stack.pop();
                    if (!c.equals(openBrackets.get(last))) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}


