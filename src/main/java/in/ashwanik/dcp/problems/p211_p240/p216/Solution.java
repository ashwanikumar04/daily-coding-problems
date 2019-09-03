package in.ashwanik.dcp.problems.p211_p240.p216;

import java.util.HashMap;
import java.util.Map;

class Solution {

    private Map<Character, Integer> map;

    Solution() {
        map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);
    }

    int convertRomanToDecimal(String roman) {
        if (roman == null || roman.isEmpty()) {
            return 0;
        }
        int result = 0;
        int index = 0;
        if (roman.length() == 1) {
            return map.get(roman.charAt(0));
        }
        while (index < roman.length()) {
            int current = map.get(roman.charAt(index));
            int next = map.get(roman.charAt(index + 1));
            if (current < next) {
                result = result + next - current;
                index += 2;
            } else {
                result = result + current;
                index++;
            }
        }
        return result;
    }
}