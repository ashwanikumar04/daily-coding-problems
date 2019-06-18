package in.ashwanik.dcp.problems.p91_120.p94;

import in.ashwanik.dcp.common.TreeNode;

class Solution {

    static class Result {
        int value;
    }

    int maximumPathSum(TreeNode<Integer> root) {

        Result result = new Result();
        result.value = Integer.MIN_VALUE;
        maximumPathSumUtil(root, result);
        return result.value;
    }

    private int maximumPathSumUtil(TreeNode<Integer> root, Result result) {
        if (root == null) {
            return 0;
        }

        int left = maximumPathSumUtil(root.getLeft(), result);
        int right = maximumPathSumUtil(root.getRight(), result);

        int maxLocal = Math.max(root.getData(), Math.max(left, right) + root.getData());

        int current = Math.max(maxLocal, left + right + root.getData());


        if (result.value < current) {
            result.value = current;
        }
        return maxLocal;
    }
}