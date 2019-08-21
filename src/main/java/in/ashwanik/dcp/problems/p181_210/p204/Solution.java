package in.ashwanik.dcp.problems.p181_210.p204;

import in.ashwanik.dcp.common.TreeNode;

class Solution {

    int numberOfNodes(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = getLeftHeight(root) + 1;
        int righHeight = getRightHeight(root) + 1;
        if (leftHeight == righHeight) {
            return (int) Math.pow(2, leftHeight) - 1;
        }

        return 1 + numberOfNodes(root.getLeft()) + numberOfNodes(root.getRight());

    }

    private int getLeftHeight(TreeNode<Integer> root) {
        int height = 0;
        if (root == null) {
            return height;
        }
        while (root.getLeft() != null) {
            root = root.getLeft();
            height++;
        }

        return height;
    }

    private int getRightHeight(TreeNode<Integer> root) {
        int height = 0;
        if (root == null) {
            return height;
        }
        while (root.getRight() != null) {
            root = root.getRight();
            height++;
        }

        return height;
    }

}