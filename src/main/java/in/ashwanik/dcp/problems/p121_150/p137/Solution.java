package in.ashwanik.dcp.problems.p121_150.p137;

import java.util.HashSet;
import java.util.Set;

class Solution {

    private int size;
    private Set<Integer> set;

    void init(int size) {
        this.size = size;
        set = new HashSet<>();
    }

    void set(Integer index, Integer value) {
        if (index > size) {
            throw new IllegalArgumentException("Index is more than the size");
        }

        if (set.contains(index) && (value == null || value == 0)) {
            set.remove(index);
        } else if ((value != null && value == 1)) {
            set.add(index);
        }
    }

    Integer get(Integer index) {
        if (index > size) {
            throw new IllegalArgumentException("Index is more than the size");
        }
        return set.contains(index) ? 1 : 0;
    }
}