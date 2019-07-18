package in.ashwanik.dcp.problems.p121_150.p145;

import in.ashwanik.dcp.common.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    void testReverse() {
        ListNode<Integer> head = new ListNode<>(Arrays.asList(1, 2, 3, 4, 5));
        Integer[] result = new Solution().reverse(head, 2).data(Integer.class);
        assertArrayEquals(new Integer[]{2, 1, 4, 3, 5}, result);
    }
}
