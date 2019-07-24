package in.ashwanik.dcp.problems.p151_180.p154;

import java.util.PriorityQueue;

class Solution {

    private PriorityQueue<Item> queue;
    private int count;

    Solution() {
        queue = new PriorityQueue<>((o1, o2) -> o2.getValue() - o1.getValue());
        count = 0;
    }

    void push(int value) {
        queue.add(new Item(++count, value));
    }

    int pop() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("The stack is empty");
        }
        return queue.poll().getValue();
    }

    private static class Item {
        private int priority;
        private int value;

        Item(int priority, int value) {
            this.priority = priority;
            this.value = value;
        }

        public int getPriority() {
            return priority;
        }

        public int getValue() {
            return value;
        }

    }


}