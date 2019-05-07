package in.ashwanik.dcp.problems.p13;

import java.util.HashMap;
import java.util.Map;

class Solution {

    int longestSubstringWithDistinctCharacters(String text, int distinctCount) {

        if (text == null || text.isEmpty() || distinctCount < 1) {
            return -1;
        }

        int windowStart = 0;
        Map<Character, Integer> countMap = new HashMap<>();
        int maxLength = 0;
        for (int windowEnd = 0; windowEnd < text.length(); windowEnd++) {
            char currentChar = text.charAt(windowEnd);

            countMap.put(currentChar, countMap.getOrDefault(currentChar, 0) + 1);

            while (countMap.size() > distinctCount) {
                char left = text.charAt(windowStart);
                countMap.put(left, countMap.get(left) - 1);
                if (countMap.get(left) == 0) {
                    countMap.remove(left);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);

        }
        return maxLength;
    }
}


