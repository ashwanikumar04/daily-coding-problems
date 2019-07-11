package in.ashwanik.dcp.problems.p121_p150.p131;

import in.ashwanik.dcp.common.ListNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testClonedList() {

        Solution.RandomListNode<Integer> head = new Solution.RandomListNode<>(1);

        Solution.RandomListNode<Integer> node1 = new Solution.RandomListNode<>(2);


        Solution.RandomListNode<Integer> node2 = new Solution.RandomListNode<>(3);


        Solution.RandomListNode<Integer> node3 = new Solution.RandomListNode<>(4);
        head.setNext(node1);
        head.setRandom(node2);
        node1.setNext(node2);
        node1.setRandom(node3);
        node2.setNext(node3);

        List<Integer> values = new ArrayList<>();
        ListNode<Integer> current = new Solution().getClonedList(head);
        while (current != null) {
            values.add(current.getData());
            current = current.getNext();
        }

        assertArrayEquals(new Integer[]{1, 2, 3, 4}, values.toArray());
    }
}
