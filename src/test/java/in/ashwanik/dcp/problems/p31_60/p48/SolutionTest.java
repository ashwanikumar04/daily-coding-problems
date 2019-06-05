package in.ashwanik.dcp.problems.p31_60.p48;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    public void testTreeFromPreorderAndInorder() {

        String[] pre = new String[]{"a", "b", "d", "e", "c", "f", "g"};
        String[] in = new String[]{"d", "b", "e", "a", "f", "c", "g"};

        TreeNode<String> root = new Solution().createTree(pre, in);
        assertArrayEquals(pre, root.preorder().toArray());
        assertArrayEquals(in, root.inorder().toArray());
    }
}