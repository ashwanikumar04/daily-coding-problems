package in.ashwanik.dcp.problems.p91_120.p114;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Set;

class Solution {

    String reverseWordsWithDelimiters(String sentence, Set<Character> delimiters) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        Deque<String> stack = new ArrayDeque<>();
        Deque<Character> queue = new ArrayDeque<>();

        int start = -1;
        int end = -1;

        for (int index = 0; index < sentence.length(); index++) {
            if (delimiters.contains(sentence.charAt(index))) {
                queue.offer(sentence.charAt(index));
                end = index - 1;
                if (start >= 0 && start < sentence.length() && end < sentence.length()) {
                    stack.push(sentence.substring(start, index));
                }
                start = index + 1;
            } else {
                if (start == -1) {
                    start = index;
                }
            }
        }
        if (start >= 0 && start < sentence.length()) {
            stack.push(sentence.substring(start));
        }
        String result = "";
        while (!stack.isEmpty()) {
            String delimiter = "";
            if (!queue.isEmpty()) {
                delimiter = queue.remove() + "";
            }
            result += stack.pop() + delimiter;
        }

        return result;
    }


}