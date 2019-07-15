package in.ashwanik.dcp.problems.p121_150.p127;

import in.ashwanik.dcp.common.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testListAdd() {
        assertArrayEquals(new Integer[]{4, 2, 1}, new Solution().add(new ListNode<>(Arrays.asList(9, 9)), new ListNode<>(Arrays.asList(5, 2))).data());
        assertArrayEquals(new Integer[]{8, 0, 0, 1}, new Solution().add(new ListNode<>(Collections.singletonList(9)), new ListNode<>(Arrays.asList(9, 9, 9))).data());
    }
}
