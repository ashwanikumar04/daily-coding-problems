package in.ashwanik.dcp.problems.p28;

import java.util.ArrayList;
import java.util.List;

class Solution {

    List<String> justifyText(List<String> text, int k) {
        if (text == null || text.isEmpty()) {
            return text;
        }

        List<String> lines = new ArrayList<>();

        List<String> line = new ArrayList<>();
        int currentLength = 0;
        for (String word : text) {
            if (((currentLength + word.length() + line.size()) > k)) {
                currentLength = 0;
                lines.add(getLine(line, k));
                line = new ArrayList<>();
            }
            line.add(word);
            currentLength += word.length();
        }
        lines.add(addLastLine(line, k));
        return lines;
    }

    private String getLine(List<String> line, int k) {
        String joined = String.join(" ", line);
        int difference = k - joined.length();
        if (difference > 0 && line.size() > 1) {
            int mod = difference % (line.size() - 1);
            int div = difference / (line.size() - 1);
            for (int index = 0; index < line.size() - 1; index += 2) {
                line.add(index + 1, spaceString(div + 1));
            }
            if (mod != 0) {
                int remaining = difference - (div * (line.size() - 1));
                for (int index = 0; index < line.size() - 1 && remaining > 0; index++) {
                    if (line.get(index).charAt(0) == ' ') {
                        line.set(index, line.get(index) + " ");
                        remaining--;
                    }
                }
            }
        }
        return String.join("", line);
    }

    private String addLastLine(List<String> line, int k) {
        if (line.size() > 1) {
            return getLine(line, k);
        } else {
            return line.get(0) + spaceString(k - line.get(0).length());
        }
    }

    private String spaceString(int number) {
        String spaces = "";
        int current = 0;
        while (current < number) {
            spaces += " ";
            current++;
        }
        return spaces;
    }
}


