package in.ashwanik.dcp.problems.p91_120.p94;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testMaximumPathSum() {
        TreeNode<Integer> root = new TreeNode<>(10,
                new TreeNode<>(2,
                        new TreeNode<>(20),
                        new TreeNode<>(1)),
                new TreeNode<>(10,
                        null,
                        new TreeNode<>(-25,
                                new TreeNode<>(3),
                                new TreeNode<>(4))));

        assertEquals(42, new Solution().maximumPathSum(root));
    }
}
