package in.ashwanik.dcp.problems.p61_90.p83;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    void testInvert() {
        TreeNode<Character> root = new TreeNode<>('a',
                new TreeNode<>('b',
                        new TreeNode<>('d'),
                        new TreeNode<>('e')),
                new TreeNode<>('c',
                        new TreeNode<>('f'),
                        null));

        assertArrayEquals(new Character[]{'c', 'f', 'a', 'e', 'b', 'd'}, new Solution().invert(root).inorder().toArray());

    }
}
