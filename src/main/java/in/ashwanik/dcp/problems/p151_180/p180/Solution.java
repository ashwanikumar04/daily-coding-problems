package in.ashwanik.dcp.problems.p151_180.p180;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    /*


5
4
3
2
1

1   5 4 3 2

2
3
4
5
1

5  2 3 4
1

4
3
2
5
1


2    4 3
5
1

3
4
2
5
1
     */


    void interleaveStack(Deque<Integer> stack) {
        interleaveStackHelper(stack, new ArrayDeque<>(), 1);
    }


    private void interleaveStackHelper(Deque<Integer> stack, Deque<Integer> queue, int index) {
        int stackSize = stack.size();
        for (int i = 0; i < stackSize - index; i++) {
            queue.offer(stack.pop());
        }

        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        if (stack.size() - index > 1) {
            interleaveStackHelper(stack, queue, index + 1);
        }
    }


}