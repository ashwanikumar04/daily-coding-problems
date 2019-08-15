package in.ashwanik.dcp.problems.p181_210.p196;

import in.ashwanik.dcp.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

class Solution {

    private Map<Integer, Integer> map;

    Solution() {
        map = new HashMap<>();
    }


    int countSum(TreeNode<Integer> root) {
        if (root == null) {
            return -1;
        }
        sum(root);
        int key = 0;
        int max = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                key = entry.getKey();
            }
        }
        return key;
    }


    private int sum(TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        if (root.getLeft() == null && root.getRight() == null) {
            return root.getData();
        }
        int leftSum = sum(root.getLeft());
        updateMap(leftSum);
        int rightSum = sum(root.getRight());
        updateMap(rightSum);
        int rootSum = root.getData() + leftSum + rightSum;
        updateMap(rootSum);
        return rootSum;
    }

    private void updateMap(int leftSum) {
        map.put(leftSum, map.getOrDefault(leftSum, 0) + 1);
    }
}