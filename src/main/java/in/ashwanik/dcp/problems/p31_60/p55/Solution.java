package in.ashwanik.dcp.problems.p31_60.p55;

import java.util.HashMap;
import java.util.Map;

class Solution {

    private static String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static int BASE = CHARACTERS.length();
    private int currentIndex;
    private Map<Integer, String> map;

    public Solution(int startIndex) {
        //This map is used as in memory db
        map = new HashMap<>();
        currentIndex = startIndex;
    }


    String encode(String url) {
        ++currentIndex;
        StringBuilder stringBuilder = new StringBuilder();
        int current = currentIndex;
        while (current > 0) {
            stringBuilder.append(CHARACTERS.charAt(current % CHARACTERS.length()));
            current = current / BASE;
        }
        map.put(currentIndex, url);
        return stringBuilder.reverse().toString();
    }

    String decode(String shortUrl) {

        int number = 0;
        for (char c : shortUrl.toCharArray()) {
            number = number * BASE + CHARACTERS.indexOf(c);
        }
        return map.get(number);
    }
}


