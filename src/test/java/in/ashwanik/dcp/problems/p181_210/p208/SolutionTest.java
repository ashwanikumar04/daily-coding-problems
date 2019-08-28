package in.ashwanik.dcp.problems.p181_210.p208;

import in.ashwanik.dcp.common.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testPartition() {
        ListNode<Integer> head = new ListNode<>(Arrays.asList(5, 1, 8, 0, 3));
        assertArrayEquals(new Integer[]{1, 0, 5, 8, 3}, new Solution().partition(head, 3).data(Integer.class));
    }
}
