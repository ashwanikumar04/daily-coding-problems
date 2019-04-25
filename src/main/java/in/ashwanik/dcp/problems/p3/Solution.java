package in.ashwanik.dcp.problems.p3;

import in.ashwanik.dcp.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

class Solution {

    String serialize(TreeNode<String> root) {
        if (root == null) {
            return "";
        }
        List<String> nodes = new ArrayList<>();
        Deque<TreeNode<String>> queue = new ArrayDeque<>();
        queue.push(root);

        ///Adding dummy node as Deque does not allow null
        TreeNode<String> dummy = new TreeNode<>("");

        while (!queue.isEmpty()) {
            TreeNode<String> node = queue.poll();
            if (node != dummy) {
                nodes.add(node.getData());
                if (node.getLeft() == null) {
                    queue.offer(dummy);
                } else {
                    queue.offer(node.getLeft());
                }
                if (node.getRight() == null) {
                    queue.offer(dummy);
                } else {
                    queue.offer(node.getRight());
                }
            } else {
                nodes.add("#");
            }
        }
        return String.join(",", nodes);

    }

    TreeNode<String> deserialize(String data) {
        if (data == null || data.isEmpty() || data.startsWith("#")) {
            return null;
        }
        String[] nodes = data.split(",");
        if (nodes.length == 0) {
            return null;
        }

        TreeNode<String> root = new TreeNode<>("0");
        Deque<TreeNode<String>> queue = new ArrayDeque<>();
        queue.add(root);
        TreeNode<String> node;
        int index = 0;
        while (!queue.isEmpty()) {
            node = queue.poll();
            node.setData(nodes[Integer.parseInt(node.getData())]);
            int left = index + 1;
            int right = index + 2;

            if (left < nodes.length - 1 && !nodes[left].equals("#")) {
                TreeNode<String> leftNode = new TreeNode<>(Integer.toString(left));
                node.setLeft(leftNode);
                queue.offer(leftNode);
            }
            if (right < nodes.length - 1 && !nodes[right].equals("#")) {
                TreeNode<String> rightNode = new TreeNode<>(Integer.toString(right));
                node.setRight(rightNode);
                queue.offer(rightNode);
            }
            index += 2;
        }

        return root;
    }
}
