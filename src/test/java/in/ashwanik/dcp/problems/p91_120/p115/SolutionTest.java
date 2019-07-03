package in.ashwanik.dcp.problems.p91_120.p115;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    void testIsSubTree() {
        TreeNode<Integer> root = new TreeNode<>(1,
                new TreeNode<>(2),
                new TreeNode<>(3,
                        new TreeNode<>(4),
                        new TreeNode<>(5)));

        assertTrue(new Solution().isSubTree(root, root.getRight()));
    }
}
