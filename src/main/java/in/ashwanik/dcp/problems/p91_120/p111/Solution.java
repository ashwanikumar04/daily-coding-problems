package in.ashwanik.dcp.problems.p91_120.p111;

import java.util.ArrayList;
import java.util.List;

class Solution {

    List<Integer> getIndices(String source, String pattern) {
        if (source == null || pattern == null || source.length() < pattern.length()) {
            return null;
        }

        List<Integer> indices = new ArrayList<>();

        int[] patternCount = new int[256];
        int[] windowCount = new int[256];

        for (int index = 0; index < pattern.length(); index++) {
            patternCount[pattern.charAt(index) - 'a']++;
            windowCount[source.charAt(index) - 'a']++;
        }


        for (int index = pattern.length(); index < source.length(); index++) {
            boolean isSame = isMapSame(patternCount, windowCount);
            if (isSame) {
                indices.add(index - pattern.length());
            }
            windowCount[source.charAt(index) - 'a']++;
            windowCount[source.charAt(index - pattern.length()) - 'a']--;
        }
        boolean isSame = isMapSame(patternCount, windowCount);
        if (isSame) {
            indices.add(source.length() - pattern.length());
        }
        return indices;
    }

    private boolean isMapSame(int[] patternCount, int[] windowCount) {
        for (int index = 0; index < patternCount.length; index++) {
            if (patternCount[index] != windowCount[index]) {
                return false;
            }
        }
        return true;
    }

}