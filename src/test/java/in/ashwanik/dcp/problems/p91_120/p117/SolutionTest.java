package in.ashwanik.dcp.problems.p91_120.p117;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testMinimumSumLevel() {
        TreeNode<Integer> root = new TreeNode<>(2,
                new TreeNode<>(3,
                        new TreeNode<>(-5),
                        new TreeNode<>(4)),
                new TreeNode<>(-2));

        assertEquals(2, new Solution().getLevelWithMinimumSum(root));
    }
}
