package in.ashwanik.dcp.problems.p151_180.p177;

import in.ashwanik.dcp.common.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testRotate() {
        ListNode<Integer> head = new ListNode<>(Arrays.asList(7, 7, 3, 5));
        assertArrayEquals(new Integer[]{3, 5, 7, 7}, new Solution().rotate(head, 2).data(Integer.class));
        head = new ListNode<>(Arrays.asList(1, 2, 3, 4, 5));
        //head = new ListNode<>(Arrays.asList(10, 20, 30, 40, 50, 60));
        assertArrayEquals(new Integer[]{3, 4, 5, 1, 2}, new Solution().rotate(head, 3).data(Integer.class));
    }
}
