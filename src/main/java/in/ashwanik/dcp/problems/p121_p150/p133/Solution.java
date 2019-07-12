package in.ashwanik.dcp.problems.p121_p150.p133;

import in.ashwanik.dcp.common.TreeNode;

class Solution {

    TreeNode<Integer> inorderSuccessorWithParent(TreeNode<Integer> root, TreeNode<Integer> node) {
        if (root == null) {
            return null;
        }
        if (node.getRight() != null) {
            return getMinimum(node.getRight());
        } else {
            TreeNode<Integer> parent = node.getParent();
            TreeNode<Integer> current = node;

            while (parent != null && current == parent.getRight()) {
                current = parent;
                parent = parent.getParent();
            }
            return parent;
        }
    }


    TreeNode<Integer> inorderSuccessor(TreeNode<Integer> root, TreeNode<Integer> node) {
        if (root == null) {
            return null;
        }

        if (node.getRight() != null) {
            return getMinimum(node.getRight());
        } else {
            TreeNode<Integer> current = root;
            TreeNode<Integer> result = null;
            while (current != null) {
                if (node.getData() < current.getData()) {
                    result = current;
                    current = current.getLeft();
                } else if (node.getData() > current.getData()) {
                    current = current.getRight();
                } else {
                    break;
                }
            }
            return result;
        }
    }


    private TreeNode<Integer> getMinimum(TreeNode<Integer> node) {
        if (node == null) {
            return null;
        }
        TreeNode<Integer> current = node;
        while (current.getLeft() != null) {
            current = current.getLeft();
        }
        return current;
    }
}