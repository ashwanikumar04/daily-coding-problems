package in.ashwanik.dcp.problems.p61_90.p83;

import in.ashwanik.dcp.common.TreeNode;

class Solution {

    TreeNode<Character> invert(TreeNode<Character> root) {
        if (root == null) {
            return root;
        }

        TreeNode<Character> left = invert(root.getLeft());
        TreeNode<Character> right = invert(root.getRight());

        root.setRight(left);
        root.setLeft(right);


        return root;
    }
}