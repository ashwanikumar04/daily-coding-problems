package in.ashwanik.dcp.problems.p20;

import in.ashwanik.dcp.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testMaxAbsoluteFilePathLength() {
        //3 -> 7 -> 8 -> 10 and B = 99 -> 1 -> 8 -> 10
        ListNode<Integer> first = new ListNode<>(3, new ListNode<>(7, new ListNode<>(8, new ListNode<>(10))));
        ListNode<Integer> second = new ListNode<>(99, new ListNode<>(1, new ListNode<>(8, new ListNode<>(10))));

        assertEquals(8, new Solution().getIntersectingNode(first, second).getData());
    }
}
