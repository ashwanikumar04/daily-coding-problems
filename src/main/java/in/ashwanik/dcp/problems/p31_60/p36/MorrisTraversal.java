package in.ashwanik.dcp.problems.p31_60.p36;

import in.ashwanik.dcp.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class MorrisTraversal {

    List<Integer> getInorderTraversal(TreeNode<Integer> root) {
        List<Integer> numbers = new ArrayList<>();

        if (root == null) {
            return numbers;
        }

        TreeNode<Integer> current = root;
        while (current != null) {
            if (current.getLeft() == null) {
                numbers.add(current.getData());
                current = current.getRight();
            } else {
                TreeNode<Integer> predecessor = current.getLeft();
                while (predecessor.getRight() != current && predecessor.getRight() != null) {
                    predecessor = predecessor.getRight();
                }
                if (predecessor.getRight() == null) {
                    predecessor.setRight(current);
                    current = current.getLeft();
                } else {
                    predecessor.setRight(null);
                    numbers.add(current.getData());
                    current = current.getRight();
                }
            }
        }
        return numbers;
    }
}
