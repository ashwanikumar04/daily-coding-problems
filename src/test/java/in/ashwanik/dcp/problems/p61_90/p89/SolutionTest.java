package in.ashwanik.dcp.problems.p61_90.p89;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    void testBST() {
        TreeNode<Integer> root = new TreeNode<>(4,
                new TreeNode<>(2,
                        new TreeNode<>(1),
                        new TreeNode<>(3)),
                new TreeNode<>(5,
                        null,
                        null));

        assertTrue(new Solution().isBST(root));
        root = new TreeNode<>(4,
                new TreeNode<>(2,
                        new TreeNode<>(1),
                        new TreeNode<>(7)),
                new TreeNode<>(5,
                        null,
                        null));

        assertFalse(new Solution().isBST(root));
    }
}
