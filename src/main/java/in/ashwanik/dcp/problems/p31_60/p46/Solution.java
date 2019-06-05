package in.ashwanik.dcp.problems.p31_60.p46;

class Solution {


    String longestPalindromincSubstring(String input) {
        if (input == null || input.isEmpty()) {
            return null;
        }
        if (input.length() == 1) {
            return input;
        }
        String longest = input.substring(0, 1);

        for (int i = 0; i < input.length(); i++) {
            String current = helper(input, i, i);
            if (current.length() > longest.length()) {
                longest = current;
            }
            current = helper(input, i, i + 1);
            if (current.length() > longest.length()) {
                longest = current;
            }
        }
        return longest;
    }

    private String helper(String input, int begin, int end) {
        while (begin >= 0 && end < input.length() && input.charAt(begin) == input.charAt(end)) {
            begin--;
            end++;
        }
        return input.substring(begin + 1, end);
    }
}


