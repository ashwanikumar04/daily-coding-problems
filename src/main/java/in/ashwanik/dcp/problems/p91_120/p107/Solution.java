package in.ashwanik.dcp.problems.p91_120.p107;

import in.ashwanik.dcp.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {

    List<Integer> levelOrder(TreeNode<Integer> root) {
        if (root == null) {
            return null;
        }

        List<Integer> items = new ArrayList<>();
        Deque<TreeNode<Integer>> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode<Integer> current = queue.remove();

            items.add(current.getData());
            if (current.getLeft() != null) {
                queue.offer(current.getLeft());
            }
            if (current.getRight() != null) {
                queue.offer(current.getRight());
            }
        }
        return items;
    }
}