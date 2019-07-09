package in.ashwanik.dcp.problems.p61_90.p78;

import in.ashwanik.dcp.common.ListNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void testKListMerge() {

        ListNode<Integer> list1 = new ListNode<>(Arrays.asList(1, 4, 5));
        ListNode<Integer> list2 = new ListNode<>(Arrays.asList(1, 3, 4));
        ListNode<Integer> list3 = new ListNode<>(Arrays.asList(2, 6));

        List<ListNode<Integer>> lists = new ArrayList<>();
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 4, 4, 5, 6}, new Solution().mergeList(lists).data());
    }
}
