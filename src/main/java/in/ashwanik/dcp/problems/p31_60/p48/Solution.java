package in.ashwanik.dcp.problems.p31_60.p48;

import in.ashwanik.dcp.common.TreeNode;

import java.util.HashMap;
import java.util.Map;


class Solution {

    private int preIndex;

    TreeNode<String> createTree(String[] preoder, String[] inorder) {
        Map<String, Integer> map = new HashMap<>();

        for (int index = 0; index < inorder.length; index++) {
            map.put(inorder[index], index);
        }
        preIndex = 0;
        return createTree(preoder, 0, inorder.length - 1, map);
    }

    private TreeNode<String> createTree(String[] preoder, int start, int end, Map<String, Integer> map) {

        if (start > end) {
            return null;
        }

        TreeNode<String> root = new TreeNode<>(preoder[preIndex++]);
        if (start == end) {
            return root;
        }
        int inIndex = map.get(root.getData());
        root.setLeft(createTree(preoder, start, inIndex - 1, map));
        root.setRight(createTree(preoder, inIndex + 1, end, map));
        return root;
    }
}


