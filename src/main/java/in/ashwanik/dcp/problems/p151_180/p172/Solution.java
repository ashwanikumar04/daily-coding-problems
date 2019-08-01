package in.ashwanik.dcp.problems.p151_180.p172;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    List<Integer> getIndices(String text, List<String> words) {
        List<Integer> indices = new ArrayList<>();
        if (text == null || text.isEmpty() || words == null || words.isEmpty()) {
            return indices;
        }
        int wordSize = words.get(0).length();
        int concatenatedWordsLength = wordSize * words.size();
        if (concatenatedWordsLength > text.length()) {
            return indices;
        }

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (int index = 0; index <= text.length() - concatenatedWordsLength; index++) {
            Map<String, Integer> tempMap = new HashMap<>(map);

            int count = words.size();
            int wordIndex = index;

            while (wordIndex < index + concatenatedWordsLength) {
                String word = text.substring(wordIndex, wordIndex + wordSize);
                if (!tempMap.containsKey(word) || tempMap.get(word) == 0) {
                    break;
                } else {
                    tempMap.put(word, tempMap.get(word) - 1);
                    count--;
                }
                wordIndex = wordIndex + wordSize;
            }

            if (count == 0) {
                indices.add(index);
            }
        }
        return indices;
    }
}