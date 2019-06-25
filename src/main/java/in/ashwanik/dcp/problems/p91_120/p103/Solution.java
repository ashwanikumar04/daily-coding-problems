package in.ashwanik.dcp.problems.p91_120.p103;

import java.util.HashMap;
import java.util.Map;

class Solution {

    String getSmallestSubstring(String str, String pattern) {

        if (pattern.length() > str.length()) {
            return null;
        }

        Map<Character, Integer> countMap = new HashMap<>();
        for (char c : pattern.toCharArray()) {
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);
        }

        int windowStart = 0;
        int windowEnd = 0;
        int subStringStart = 0;
        int matched = 0;
        int minLength = Integer.MAX_VALUE;
        for (windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            if (countMap.containsKey(rightChar)) {
                countMap.put(rightChar, countMap.get(rightChar) - 1);
                if (countMap.get(rightChar) >= 0) {
                    matched++;
                }
            }

            while (matched == pattern.length()) {
                if (minLength > windowEnd - windowStart + 1) {
                    minLength = windowEnd - windowStart + 1;
                    subStringStart = windowStart;
                }
                char leftChar = str.charAt(windowStart);
                windowStart++;
                if (countMap.containsKey(leftChar)) {
                    if (countMap.get(leftChar) == 0) {
                        matched--;
                    }
                    countMap.put(leftChar, countMap.get(leftChar) + 1);
                }
            }
        }
        return minLength > str.length() ? null : str.substring(subStringStart, subStringStart + minLength);
    }
}