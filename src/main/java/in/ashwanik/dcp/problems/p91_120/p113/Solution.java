package in.ashwanik.dcp.problems.p91_120.p113;

class Solution {

    String reverseWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return sentence;
        }

        char[] chars = sentence.toCharArray();
        reverse(chars, 0, chars.length - 1);
        int start = -1;
        int end = -1;
        for (int index = 0; index < sentence.length(); index++) {
            if (start == -1) {
                start = index;
            }
            if (chars[index] == ' ') {
                end = index - 1;
                reverse(chars, start, end);
                start = index + 1;
            }
        }
        reverse(chars, start, chars.length - 1);
        return new String(chars);
    }

    private void reverse(char[] chars, int start, int end) {
        int left = start;
        int right = end;
        while (left < right && (left >= 0 && left < chars.length) && (right < chars.length)) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
    }
}