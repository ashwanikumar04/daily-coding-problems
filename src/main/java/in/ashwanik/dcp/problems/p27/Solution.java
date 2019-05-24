package in.ashwanik.dcp.problems.p27;

import java.util.*;

class Solution {

    private Map<Character, Character> openBrackets;
    private Map<Character, Character> closeBrackets;

    private Set<Character> brackets;

    Solution() {
        openBrackets = new HashMap<>();
        openBrackets.put('{', '}');
        openBrackets.put('[', ']');
        openBrackets.put('(', ')');

        closeBrackets = new HashMap<>();
        closeBrackets.put('}', '{');
        closeBrackets.put(']', '[');
        closeBrackets.put(')', '(');

        brackets = new HashSet<>();
        brackets.addAll(Arrays.asList('(', ')', '{', '}', '[', ']'));
    }

    boolean checkIfBracketsAreBalanced(String data) {
        if (data == null || data.isEmpty()) {
            return true;
        }
        Deque<Character> stack = new ArrayDeque<>();

        for (Character c : data.toCharArray()) {
            if (brackets.contains(c)) {
                if (openBrackets.containsKey(c)) {
                    stack.addLast(c);
                } else {
                    Character last = stack.peekLast();
                    if (last != null && last.equals(closeBrackets.get(c))) {
                        stack.removeLast();
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}


