package in.ashwanik.dcp.problems.p31_60.p37;

import java.util.ArrayList;
import java.util.List;

class Solution {

    List<String> powerSet(List<Integer> set) {
        List<String> powerset = new ArrayList<>();

        if (set == null || set.isEmpty()) {
            return powerset;
        }
        int numberOfSets = (int) Math.pow(2, set.size());

        for (int index = 0; index < numberOfSets; index++) {
            List<String> currentSet = new ArrayList<>();
            for (int count = 0; count < set.size(); count++) {
                if ((index & (1 << count)) > 0) {
                    currentSet.add(Integer.toString(set.get(count)));
                }
            }
            powerset.add(String.join(",", currentSet));
        }
        powerset.sort(String::compareTo);
        return powerset;
    }
}


