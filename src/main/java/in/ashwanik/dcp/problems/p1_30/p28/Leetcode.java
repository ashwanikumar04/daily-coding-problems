package in.ashwanik.dcp.problems.p1_30.p28;

import java.util.ArrayList;
import java.util.List;

public class Leetcode {

    public List<String> fullJustify(String[] words, int maxWidth) {
        if (words == null || words.length == 0) {
            return new ArrayList<>();
        }

        List<String> lines = new ArrayList<>();

        List<String> line = new ArrayList<>();
        int currentLength = 0;
        for (String word : words) {
            if (((currentLength + word.length() + line.size()) > maxWidth)) {
                currentLength = 0;
                lines.add(getLine(line, maxWidth));
                line = new ArrayList<>();
            }
            line.add(word);
            currentLength += word.length();
        }
        lines.add(singleWordLine(line, maxWidth));
        return lines;
    }

    private String getLine(List<String> line, int k) {
        String joined = String.join(" ", line);
        int difference = k - joined.length();
        if (difference > 0 && line.size() > 1) {
            int rooms = line.size() - 1;
            int mod = difference % (rooms);
            int div = difference / (rooms);
            for (int index = 0; index < line.size() - 1; index += 2) {
                line.add(index + 1, spaceString(div + 1));
            }
            if (mod != 0) {
                int remaining = difference - (div * rooms);
                for (int index = 0; index < line.size() - 1 && remaining > 0; index++) {
                    if (line.get(index).charAt(0) == ' ') {
                        line.set(index, line.get(index) + " ");
                        remaining--;
                    }
                }
            }
        } else if (difference > 0 && line.size() == 1) {
            return singleWordLine(line, k);
        } else {
            return joined;
        }
        return String.join("", line);
    }

    private String singleWordLine(List<String> line, int k) {
        String lastLine = String.join(" ", line);

        if (k - lastLine.length() > 0) {
            lastLine += spaceString(k - lastLine.length());
        }

        return lastLine;
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
