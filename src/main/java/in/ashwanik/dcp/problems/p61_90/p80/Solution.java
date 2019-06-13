package in.ashwanik.dcp.problems.p61_90.p80;

import in.ashwanik.dcp.common.TreeNode;

class Solution {

    private int deepestLevel = 0;
    private TreeNode<Integer> deepestNode = null;

    TreeNode<Integer> getDeepestNode(TreeNode<Integer> root) {
        if (root == null) {
            return null;
        }

        getNode(root, 0);
        return deepestNode;
    }

    private void getNode(TreeNode<Integer> root, int level) {
        if (root != null) {
            getNode(root.getLeft(), ++level);
            if (level > deepestLevel) {
                deepestNode = root;
                deepestLevel = level;
            }
            getNode(root.getRight(), level);
        }
    }
}