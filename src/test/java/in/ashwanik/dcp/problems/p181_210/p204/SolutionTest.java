package in.ashwanik.dcp.problems.p181_210.p204;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testCountNodes() {
        TreeNode<Integer> root = new TreeNode<>(1
                , new TreeNode<>(2
                , new TreeNode<>(4)
                , new TreeNode<>(5))
                , new TreeNode<>(3));

        assertEquals(5, new Solution().numberOfNodes(root));
    }
}
