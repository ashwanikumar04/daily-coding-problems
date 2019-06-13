package in.ashwanik.dcp.problems.p61_90.p80;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    /*

                15
            10      20
        8
     */

    @Test
    void testDeepestNode() {
        TreeNode<Integer> root = new TreeNode<>(15,
                new TreeNode<>(10,
                        new TreeNode<>(8),
                        null),
                new TreeNode<>(20));

        assertEquals(8, new Solution().getDeepestNode(root).getData());
    }
}
