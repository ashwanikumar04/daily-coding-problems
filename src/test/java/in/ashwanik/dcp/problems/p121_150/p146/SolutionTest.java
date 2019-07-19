package in.ashwanik.dcp.problems.p121_150.p146;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    void testPruneTree() {

        TreeNode<Integer> root = new TreeNode<>(0,
                new TreeNode<>(1),
                new TreeNode<>(0,
                        new TreeNode<>(1,
                                new TreeNode<>(0),
                                new TreeNode<>(0)),
                        new TreeNode<>(0)));
        assertArrayEquals(new Integer[]{1, 0, 1, 0}, new Solution().pruneTree(root).inorder().toArray());
    }
}
