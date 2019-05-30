package in.ashwanik.dcp.problems.p1_30.p8;

import in.ashwanik.dcp.common.TreeNode;

class Solution {

   public int univalSubtreeCount(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }

        int count = univalSubtreeCount(root.getLeft()) + univalSubtreeCount(root.getRight());

        if (root.getLeft() != null && !root.getLeft().getData().equals(root.getData())) {
            return count;
        }

        if (root.getRight() != null && !root.getRight().getData().equals(root.getData())) {
            return count;
        }

        return count + 1;
    }

}


