package in.ashwanik.dcp.problems.p91_120.p112;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    void testLCA() {

        TreeNode<Integer> root = new TreeNode<>(1
                , new TreeNode<>(2, new TreeNode<>(4), new TreeNode<>(5))
                , new TreeNode<>(3, new TreeNode<>(6), new TreeNode<>(7)));

        assertEquals(2, new Solution().getLCA(root, 4, 5).getData());
    }
}
