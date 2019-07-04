package in.ashwanik.dcp.problems.p91_120.p116;

import in.ashwanik.dcp.common.TreeNode;

import java.util.Random;

class Solution {

    private Random random;

    Solution() {
        random = new Random();
    }

    TreeNode<Integer> generate() {
        TreeNode<Integer> root = new TreeNode<>(0);
        if (random.nextBoolean()) {
            root.setLeft(generate());
        }
        if (random.nextBoolean()) {
            root.setRight(generate());
        }
        return root;
    }


}