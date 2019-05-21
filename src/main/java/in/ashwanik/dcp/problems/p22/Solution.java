package in.ashwanik.dcp.problems.p22;

import java.util.*;

class Solution {

    private Set<String> dictionary;

    Solution(Set<String> dictionary) {
        this.dictionary = dictionary;
    }

    List<String> validWords(String text) {
        if (text == null || text.isEmpty()) {
            return new ArrayList<>();
        }
        Map<String, List<String>> saved = new HashMap<>();
        return breakWord(text, saved);
    }

    private List<String> breakWord(String text, Map<String, List<String>> saved) {
        if (saved.containsKey(text)) {
            return saved.get(text);
        }

        List<String> result = new ArrayList<>();
        if (dictionary.contains(text)) {
            result.add(text);
        }

        for (int index = 1; index <= text.length(); index++) {
            String prefix = text.substring(0, index);
            if (dictionary.contains(prefix)) {
                String suffix = text.substring(index);
                List<String> response = breakWord(suffix, saved);
                for (String str : response) {
                    result.add(prefix + " " + str);
                }
            }
        }
        saved.put(text, result);
        return result;
    }
}


