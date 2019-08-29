package in.ashwanik.dcp.problems.p211_p240.p211;

import java.util.ArrayList;
import java.util.List;

class Solution {

    List<Integer> getIndices(String text, String pattern) {
        List<Integer> list = new ArrayList<>();
        if (text == null || text.isEmpty() || pattern == null) {
            return list;
        }

        int index = 0;
        while (index != -1) {
            index = text.indexOf(pattern, index);
            if (index != -1) {
                list.add(index);
                index += pattern.length();
            }
        }
        return list;
    }
}