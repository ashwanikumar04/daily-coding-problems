package in.ashwanik.dcp.problems.p181_210.p210;

import java.util.ArrayList;
import java.util.List;

class Solution {

    List<Integer> getCollatzSequence(int number) {
        List<Integer> sequence = new ArrayList<>();
        if (number < 1) {
            return sequence;
        }
        sequence.add(number);
        if (number == 1) {
            return sequence;
        }

        int current = number;
        while (current != 1) {
            if (current % 2 == 0) {
                current = current / 2;
            } else {
                current = current * 3 + 1;
            }
            sequence.add(current);
        }
        return sequence;
    }
}