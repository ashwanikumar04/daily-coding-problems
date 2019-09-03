package in.ashwanik.dcp.problems.p211_p240.p215;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testBottomView() {
        TreeNode<Integer> root = new TreeNode<>(5,
                new TreeNode<>(3,
                        new TreeNode<>(1,
                                new TreeNode<>(0),
                                null),
                        new TreeNode<>(4)),
                new TreeNode<>(7,
                        new TreeNode<>(6),
                        new TreeNode<>(9,
                                new TreeNode<>(8),
                                null)));


        assertArrayEquals(new Integer[]{0, 1, 3, 6, 8, 9}, new Solution().getBottomView(root).toArray());
    }
}
