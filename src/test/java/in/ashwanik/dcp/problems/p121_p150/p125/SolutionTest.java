package in.ashwanik.dcp.problems.p121_p150.p125;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testSumPair() {

        TreeNode<Integer> root = new TreeNode<>(10,
                new TreeNode<>(5),
                new TreeNode<>(15,
                        new TreeNode<>(11),
                        new TreeNode<>(15)));
        int[] pair = new Solution().getSumPair(root, 20);
        Arrays.sort(pair);
        assertArrayEquals(new int[]{5, 15}, pair);
    }
}
