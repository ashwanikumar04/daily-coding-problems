package in.ashwanik.dcp.problems.p31_60.p36;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MorrisTraversalTest {
    @Test
    void testInorder() {

        TreeNode<Integer> root = new TreeNode<>(15,
                new TreeNode<>(10,
                        new TreeNode<>(8),
                        new TreeNode<>(12)),
                new TreeNode<>(20,
                        new TreeNode<>(16),
                        new TreeNode<>(25)));


        assertArrayEquals(new Integer[]{8, 10, 12, 15, 16, 20, 25}, new MorrisTraversal().getInorderTraversal(root).toArray());
    }
}
