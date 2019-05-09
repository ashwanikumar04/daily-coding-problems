package in.ashwanik.dcp.problems.p16;

class Solution {

    private int max;
    private int current;
    private int[] array;

    Solution(int max) {
        this.max = max;
        this.array = new int[max];
    }

    void record(int orderId) {
        array[current] = orderId;
        current = (current + 1) % max;
    }

    int getLast(int i) {
        return array[(current - i + max) % max];
    }
}


