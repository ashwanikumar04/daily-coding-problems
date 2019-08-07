package in.ashwanik.dcp.problems.p151_180.p179;

import in.ashwanik.dcp.common.TreeNode;

class Solution {
    TreeNode<Integer> getBST(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        NodeIndex nodeIndex = new NodeIndex();
        nodeIndex.index = array.length - 1;
        return construct(array, array[nodeIndex.index], Integer.MIN_VALUE, Integer.MAX_VALUE, nodeIndex);
    }

    private TreeNode<Integer> construct(int[] array, int key, int min, int max, NodeIndex nodeIndex) {
        if (nodeIndex.index < 0) {
            return null;
        }

        TreeNode<Integer> root = null;
        if (key > min && key < max) {
            root = new TreeNode<>(key);

            nodeIndex.index--;
            if (nodeIndex.index > 0) {
                root.setRight(construct(array, array[nodeIndex.index], key, max, nodeIndex));
                root.setLeft(construct(array, array[nodeIndex.index], min, key, nodeIndex));
            }
        }

        return root;
    }


    private static class NodeIndex {
        int index = 0;
    }
}