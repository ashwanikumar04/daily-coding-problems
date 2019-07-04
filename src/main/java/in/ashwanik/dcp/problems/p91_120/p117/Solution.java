package in.ashwanik.dcp.problems.p91_120.p117;

import in.ashwanik.dcp.common.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

    int getLevelWithMinimumSum(TreeNode<Integer> root) {
        if (root == null) {
            return -1;
        }

        Deque<TreeNode<Integer>> queue = new ArrayDeque<>();
        int minSum = Integer.MAX_VALUE;
        int minLevel = -1;
        int currentSum = 0;
        int level = 0;
        queue.offer(root);
        TreeNode<Integer> dummy = new TreeNode<>(0);

        queue.offer(dummy);

        while (!queue.isEmpty()) {
            TreeNode<Integer> current = queue.removeFirst();
            if (current == dummy) {
                if (currentSum < minSum) {
                    minSum = currentSum;
                    minLevel = level;
                }
                if (!queue.isEmpty()) {
                    queue.offer(dummy);
                }
                level++;
                currentSum = 0;
            } else {
                currentSum += current.getData();
                if (current.getLeft() != null) {
                    queue.offer(current.getLeft());
                }
                if (current.getRight() != null) {
                    queue.offer(current.getRight());
                }
            }
        }
        return minLevel;
    }

}