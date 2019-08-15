package in.ashwanik.dcp.problems.p181_210.p196;

import in.ashwanik.dcp.common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testCount() {
        assertEquals(2, new Solution().countSum(new TreeNode<>(5,
                new TreeNode<>(2),
                new TreeNode<>(-5))));
    }
}
