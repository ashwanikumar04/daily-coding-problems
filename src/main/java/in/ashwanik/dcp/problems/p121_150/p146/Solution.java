package in.ashwanik.dcp.problems.p121_150.p146;

import in.ashwanik.dcp.common.TreeNode;

class Solution {

    TreeNode<Integer> pruneTree(TreeNode<Integer> root) {
        if (root == null) {
            return null;
        }
        root.setLeft(pruneTree(root.getLeft()));
        root.setRight(pruneTree(root.getRight()));

        if (root.getData().equals(0) && root.getLeft() == null && root.getRight() == null) {
            return null;
        }
        return root;
    }
}