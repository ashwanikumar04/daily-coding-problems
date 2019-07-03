package in.ashwanik.dcp.problems.p91_120.p115;

import in.ashwanik.dcp.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {

    boolean isSubTree(TreeNode<Integer> S, TreeNode<Integer> T) {
        if (S == null) {
            return false;
        }

        List<String> s = new ArrayList<>();
        List<String> t = new ArrayList<>();

        inorder(S, s);
        inorder(T, t);

        String sStr = String.join(",", s);
        String tStr = String.join(",", t);
        if (!sStr.contains(tStr)) {
            return false;
        }

        s.clear();
        t.clear();

        preorder(S, s);
        preorder(T, t);

        sStr = String.join(",", s);
        tStr = String.join(",", t);
        return sStr.contains(tStr);
    }


    private void inorder(TreeNode<Integer> root, List<String> items) {
        if (root == null) {
            items.add("$");
            return;
        }
        inorder(root.getLeft(), items);
        items.add(root.getData().toString());
        inorder(root.getRight(), items);
    }


    private void preorder(TreeNode<Integer> root, List<String> items) {
        if (root == null) {
            items.add("$");
            return;
        }
        items.add(root.getData().toString());
        preorder(root.getLeft(), items);
        preorder(root.getRight(), items);
    }

}