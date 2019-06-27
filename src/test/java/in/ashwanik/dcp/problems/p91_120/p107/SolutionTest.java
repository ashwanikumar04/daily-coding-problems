package in.ashwanik.dcp.problems.p91_120.p107;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testLevelOrder() {
        TreeNode<Integer> root = new TreeNode<>(1,
                new TreeNode<>(2),
                new TreeNode<>(3,
                        new TreeNode<>(4),
                        new TreeNode<>(5)));

        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, new Solution().levelOrder(root).stream().mapToInt(x -> x).toArray());
    }
}
