package in.ashwanik.dcp.problems.p61_90.p73;

import in.ashwanik.dcp.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void testReverseList() {
        ListNode<Integer> head = new ListNode<>(1,
                new ListNode<>(2,
                        new ListNode<>(3,
                                new ListNode<>(4,
                                        new ListNode<>(5)))));


        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, new Solution().reverse(head).data().stream().mapToInt(x -> x).toArray());
    }
}
