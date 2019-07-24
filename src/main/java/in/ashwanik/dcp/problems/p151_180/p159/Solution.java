package in.ashwanik.dcp.problems.p151_180.p159;

import java.util.HashSet;
import java.util.Set;

class Solution {

    Character findRecurring(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (set.contains(c)) {
                return c;
            }
            set.add(c);
        }
        return null;
    }
}