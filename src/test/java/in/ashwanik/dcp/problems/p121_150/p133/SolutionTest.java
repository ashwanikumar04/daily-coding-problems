package in.ashwanik.dcp.problems.p121_150.p133;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void testInorderSuccessor() {
        TreeNode<Integer> root = new TreeNode<>(20);
        TreeNode<Integer> left1 = new TreeNode<>(8);
        TreeNode<Integer> right1 = new TreeNode<>(22);
        root.setLeft(left1);
        root.setRight(right1);
        left1.setParent(root);
        right1.setParent(root);

        TreeNode<Integer> left2 = new TreeNode<>(4);
        TreeNode<Integer> right2 = new TreeNode<>(12);

        left1.setLeft(left2);
        left1.setRight(right2);
        left2.setParent(left1);
        right2.setParent(left1);

        TreeNode<Integer> left3 = new TreeNode<>(10);
        TreeNode<Integer> right3 = new TreeNode<>(14);
        right2.setLeft(left3);
        right2.setRight(right3);
        left3.setParent(right2);
        right3.setParent(right2);

        assertEquals(10, new Solution().inorderSuccessorWithParent(root,left1).getData());
        assertEquals(12, new Solution().inorderSuccessorWithParent(root,left3).getData());
        assertEquals(20, new Solution().inorderSuccessorWithParent(root,right3).getData());

        assertEquals(10, new Solution().inorderSuccessor(root,left1).getData());
        assertEquals(12, new Solution().inorderSuccessor(root,left3).getData());
        assertEquals(20, new Solution().inorderSuccessor(root,right3).getData());
    }
}
