package in.ashwanik.dcp.problems.p91_120.p104;

import in.ashwanik.dcp.common.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    void testIsPalindrome() {
        ListNode<Integer> head = new ListNode<>(Arrays.asList(1, 2, 3, 3, 2, 1));
        assertTrue(new Solution().isPalindrome(head));
        head = new ListNode<>(Arrays.asList(1, 2, 1));
        assertTrue(new Solution().isPalindrome(head));
        head = new ListNode<>(Arrays.asList(1, 2, 2, 1));
        assertTrue(new Solution().isPalindrome(head));
        head = new ListNode<>(Arrays.asList(1, 1));
        assertTrue(new Solution().isPalindrome(head));
        head = new ListNode<>(Arrays.asList(1));
        assertTrue(new Solution().isPalindrome(head));
        head = new ListNode<>(Arrays.asList(1, 2, 3, 1));
        assertFalse(new Solution().isPalindrome(head));
    }
}
