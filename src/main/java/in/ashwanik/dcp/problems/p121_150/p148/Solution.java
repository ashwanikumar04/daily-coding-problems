package in.ashwanik.dcp.problems.p121_150.p148;

import java.util.ArrayList;
import java.util.List;

class Solution {

    List<Integer> grayCode(int numberOfBits) {
        if (numberOfBits == 0) {
            List<Integer> result = new ArrayList<>();
            result.add(0);
            return result;
        }

        List<Integer> result = grayCode(numberOfBits - 1);
        int numberToAdd = 1 << (numberOfBits - 1);
        for (int index = result.size() - 1; index >= 0; index--) {
            result.add(result.get(index) + numberToAdd);
        }
        return result;
    }
}