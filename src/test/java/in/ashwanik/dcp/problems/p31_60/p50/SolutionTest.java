package in.ashwanik.dcp.problems.p31_60.p50;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testEvaluate() {
        TreeNode<String> root = new TreeNode<>("*",
                new TreeNode<>("+",
                        new TreeNode<>("3"),
                        new TreeNode<>("2")),
                new TreeNode<>("+",
                        new TreeNode<>("4"),
                        new TreeNode<>("5")));

        assertEquals(45, new Solution().evaluate(root));
    }
}
