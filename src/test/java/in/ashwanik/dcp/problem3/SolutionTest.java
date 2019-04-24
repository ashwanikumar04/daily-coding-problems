package in.ashwanik.dcp.problem3;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testProduct() {
        /*
                    2
                3       4
                    5       6


         */

        // Serialized: 2,3,4,#,#,5,6,#,#,#,#

        TreeNode<String> root = new TreeNode<>("2");
        TreeNode<String> left = new TreeNode<>("3");
        TreeNode<String> right = new TreeNode<>("4");
        root.setLeft(left);
        root.setRight(right);

        TreeNode<String> left_4 = new TreeNode<>("5");
        TreeNode<String> right_4 = new TreeNode<>("6");
        right.setLeft(left_4);
        right.setRight(right_4);
        Solution solution = new Solution();
        assertEquals("2,3,4,#,#,5,6,#,#,#,#", solution.serialize(solution.deserialize(solution.serialize(root))));
    }
}
