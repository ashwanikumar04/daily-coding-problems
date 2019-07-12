package in.ashwanik.dcp.problems.p121_p150.p135;

import in.ashwanik.dcp.common.TreeNode;

class Solution {

    private static class Result {
        int sum;
    }

    int minPathSum(TreeNode<Integer> root) {
        if (root == null) {
            return Integer.MIN_VALUE;
        }
        Result result = new Result();
        result.sum = Integer.MAX_VALUE;

        minPathSumUtil(root, result, 0);
        return result.sum;
    }

    private void minPathSumUtil(TreeNode<Integer> node, Result result, int currentSum) {
        if (node == null) {
            return;
        }
        currentSum = currentSum + node.getData();

        if (node.getLeft() == null && node.getRight() == null) {
            if (currentSum < result.sum) {
                result.sum = currentSum;
            }
        }
        minPathSumUtil(node.getLeft(), result, currentSum);
        minPathSumUtil(node.getRight(), result, currentSum);
    }
}