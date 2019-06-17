package in.ashwanik.dcp.problems.p61_90.p89;

import in.ashwanik.dcp.common.TreeNode;

class Solution {

    private TreeNode<Integer> prev = null;

    boolean isBST(TreeNode<Integer> root) {
        if (root == null) {
            return true;
        }
        if (!isBST(root.getLeft())) {
            return false;
        }
        if (prev != null && prev.getData() >= root.getData()) {
            return false;
        }
        prev = root;
        return isBST(root.getRight());
    }
}