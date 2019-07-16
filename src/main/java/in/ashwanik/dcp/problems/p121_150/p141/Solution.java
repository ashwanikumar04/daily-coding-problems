package in.ashwanik.dcp.problems.p121_150.p141;

class Solution {

    private int[] topOfStack;
    private int[] array;
    private int[] next;
    private int nextAvailable;

    Solution(int numberOfStacks, int total) {
        topOfStack = new int[numberOfStacks];
        array = new int[total];
        next = new int[total];
        nextAvailable = 0;

        for (int index = 0; index < numberOfStacks; index++) {
            topOfStack[index] = -1;
        }

        for (int index = 0; index < total; index++) {
            next[index] = index + 1;
        }
        next[total - 1] = -1;
    }

    void push(int stack, int value) {
        if (stack < 0 || stack >= topOfStack.length) {
            throw new IndexOutOfBoundsException();
        }
        int currentTop = topOfStack[stack];
        array[nextAvailable] = value;
        topOfStack[stack] = nextAvailable;
        int currentNext = next[nextAvailable];
        next[nextAvailable] = currentTop;
        nextAvailable = currentNext;
    }

    int pop(int stack) {
        if (stack < 0 || stack >= topOfStack.length || topOfStack[stack] < 0) {
            throw new IndexOutOfBoundsException();
        }
        int currentTop = topOfStack[stack];
        topOfStack[stack] =  next[currentTop];
        next[currentTop] = nextAvailable;
        nextAvailable = currentTop;
        return array[currentTop];
    }
}