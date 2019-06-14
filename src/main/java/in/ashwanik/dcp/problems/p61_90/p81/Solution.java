package in.ashwanik.dcp.problems.p61_90.p81;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    private Map<Character, List<Character>> map;

    Solution() {
        map = new HashMap<>();
        map.put('1', new ArrayList<>());
        map.put('2', Arrays.asList('a', 'b', 'c'));
        map.put('3', Arrays.asList('d', 'e', 'f'));
    }

    List<String> getCombinations(String number) {
        List<String> result = new ArrayList<>();
        if (number == null || number.isEmpty()) {
            return result;
        }
        result.add("");
        for (char c : number.toCharArray()) {
            List<String> temp = new ArrayList<>();
            List<Character> chars = map.get(c);
            if (chars.isEmpty()) {
                continue;
            }
            for (String str : result) {
                for (char current : chars) {
                    temp.add(str + current);
                }
            }
            result = temp;
        }
        return result;
    }
}