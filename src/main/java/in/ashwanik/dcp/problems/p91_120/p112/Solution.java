package in.ashwanik.dcp.problems.p91_120.p112;

import in.ashwanik.dcp.common.TreeNode;

class Solution {

    TreeNode<Integer> getLCA(TreeNode<Integer> root, Integer left, Integer right) {
        if (root == null) {
            return null;
        }

        if (root.getData() == left || root.getData() == right) {
            return root;
        }

        TreeNode<Integer> leftLCA = getLCA(root.getLeft(), left, right);
        TreeNode<Integer> rightLCA = getLCA(root.getRight(), left, right);
        if (leftLCA != null && rightLCA != null) {
            return root;
        }
        return leftLCA != null ? leftLCA : rightLCA;
    }
}