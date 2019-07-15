package in.ashwanik.dcp.problems.p121_150.p125;

import in.ashwanik.dcp.common.TreeNode;

import java.util.HashSet;
import java.util.Set;

class Solution {
    int[] getSumPair(TreeNode<Integer> root, int sum) {
        if (root == null) {
            return null;
        }

        int[] pair = new int[2];
        Set<Integer> set = new HashSet<>();

        findPair(root, set, sum, pair);

        return pair;
    }

    private boolean findPair(TreeNode<Integer> root, Set<Integer> set, int sum, int[] pair) {

        if (root == null) {
            return false;
        }


        if (findPair(root.getLeft(), set, sum, pair)) {
            return true;
        }

        if (set.contains(sum - root.getData())) {
            pair[0] = root.getData();
            pair[1] = sum - root.getData();
            return true;
        } else {
            set.add(root.getData());
        }
        return findPair(root.getRight(), set, sum, pair);

    }
}