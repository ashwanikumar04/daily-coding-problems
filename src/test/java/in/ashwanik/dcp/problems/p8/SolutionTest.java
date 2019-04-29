package in.ashwanik.dcp.problems.p8;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testMissingNumber() {
        assertEquals(5, new Solution()
                .univalSubtreeCount(new TreeNode<>(0,
                        new TreeNode<>(1),
                        new TreeNode<>(0,
                                new TreeNode<>(1,
                                        new TreeNode<>(1),
                                        new TreeNode<>(1)),
                                new TreeNode<>(0)))));
    }
}
