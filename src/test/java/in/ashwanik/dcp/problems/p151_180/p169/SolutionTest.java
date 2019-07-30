package in.ashwanik.dcp.problems.p151_180.p169;

import in.ashwanik.dcp.common.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    void testListSort() {
        assertArrayEquals(new Integer[]{1, 2, 3, 9},
                new Solution().sort(new ListNode<>(Arrays.asList(1, 9, 2, 3))).data(Integer.class));
        assertArrayEquals(new Integer[]{1, 2, 3, 9, 10},
                new Solution().sort(new ListNode<>(Arrays.asList(10, 1, 9, 2, 3))).data(Integer.class));
    }
}
