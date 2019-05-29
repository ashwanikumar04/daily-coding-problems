package in.ashwanik.dcp.problems.p1_30.p24;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    @Test
    void testLockUnLockTree() {
        Solution.TreeNode treeNode = new Solution.TreeNode();
        treeNode.data = 1;
        treeNode.left = new Solution.TreeNode();
        treeNode.right = new Solution.TreeNode();
        assertTrue(new Solution().lock(treeNode));
    }
}
