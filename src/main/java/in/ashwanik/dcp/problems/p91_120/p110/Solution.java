package in.ashwanik.dcp.problems.p91_120.p110;

import in.ashwanik.dcp.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {

    List<List<Integer>> getAllPaths(TreeNode<Integer> root) {
        if (root == null) {
            return null;
        }

        List<List<Integer>> paths = new ArrayList<>();
        getPaths(root, paths, new ArrayList<>());
        return paths;
    }


    private void getPaths(TreeNode<Integer> root, List<List<Integer>> paths, List<Integer> currentPath) {
        if (root == null) {
            return;
        }
        currentPath.add(root.getData());
        if (root.getLeft() == null && root.getRight() == null) {
            paths.add(currentPath);
            return;
        }
        if (root.getLeft() != null) {
            getPaths(root.getLeft(), paths, new ArrayList<>(currentPath));
        }

        if (root.getRight() != null) {
            getPaths(root.getRight(), paths, new ArrayList<>(currentPath));
        }
    }

}