package in.ashwanik.dcp.problems.p151_180.p179;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    void testPostOrderToBST() {
        TreeNode<Integer> root = new Solution().getBST(new int[]{2, 4, 3, 8, 7, 5});
        assertArrayEquals(new Integer[]{2, 3, 4, 5, 7, 8}, root.inorder().toArray());
    }
}
