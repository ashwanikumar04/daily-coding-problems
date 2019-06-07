package in.ashwanik.dcp.problems.p31_60.p57;

import java.util.ArrayList;
import java.util.List;

class Solution {

    List<String> breakSentence(String text, int k) {
        if (text == null || text.isEmpty()) {
            return null;
        }

        List<String> result = new ArrayList<>();

        int currentLengh = 0;
        List<String> line = new ArrayList<>();
        for (String str : text.split(" ")) {
            if (str.length() > k) {
                return null;
            }
            if ((currentLengh + str.length() + line.size()) > k) {
                result.add(String.join(" ", line));
                line = new ArrayList<>();
                currentLengh = 0;
            }
            line.add(str);
            currentLengh += str.length();
        }
        result.add(String.join(" ", line));
        return result;
    }
}


