package in.ashwanik.dcp.problems.p26;

import in.ashwanik.dcp.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testKthLastNode() {
        ListNode<Integer> head = new ListNode<>(1,
                new ListNode<>(2,
                        new ListNode<>(3,
                                new ListNode<>(4,
                                        new ListNode<>(5)))));

        assertEquals(3, new Solution().getKthNodeFromLast(head, 3).getData());
    }
}
