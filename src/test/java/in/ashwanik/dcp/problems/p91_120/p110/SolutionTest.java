package in.ashwanik.dcp.problems.p91_120.p110;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testAllPaths() {

        int[][] paths = new int[][]{{1, 2}, {1, 3, 4}, {1, 3, 5}};
        TreeNode<Integer> root = new TreeNode<>(1,
                new TreeNode<>(2),
                new TreeNode<>(3,
                        new TreeNode<>(4),
                        new TreeNode<>(5)));
        List<List<Integer>> pathsToLeaves = new Solution().getAllPaths(root);

        for (int index = 0; index < paths.length; index++) {
            assertArrayEquals(paths[index], pathsToLeaves.get(index).stream().mapToInt(x -> x).toArray());
        }
    }
}
