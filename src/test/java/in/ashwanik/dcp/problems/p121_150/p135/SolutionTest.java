package in.ashwanik.dcp.problems.p121_150.p135;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testMinPathSum() {

        /*
          10
         /  \
        5    5
         \     \
           2    1
               /
             -1
         */

        TreeNode<Integer> root = new TreeNode<>(10,
                new TreeNode<>(5,
                        null,
                        new TreeNode<>(2)),
                new TreeNode<>(5, null, new TreeNode<>(1, new TreeNode<>(-1), null)));

        assertEquals(15, new Solution().minPathSum(root));
    }
}
