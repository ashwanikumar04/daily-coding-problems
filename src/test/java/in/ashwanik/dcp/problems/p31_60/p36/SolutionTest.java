package in.ashwanik.dcp.problems.p31_60.p36;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testKthLargest() {

        TreeNode<Integer> root = new TreeNode<>(15,
                new TreeNode<>(10,
                        new TreeNode<>(8),
                        new TreeNode<>(12)),
                new TreeNode<>(20,
                        new TreeNode<>(16),
                        new TreeNode<>(25)));


        assertEquals(25, new Solution().getKthLargest(root, 1).getData());
        assertEquals(20, new Solution().getKthLargest(root, 2).getData());
    }
}
