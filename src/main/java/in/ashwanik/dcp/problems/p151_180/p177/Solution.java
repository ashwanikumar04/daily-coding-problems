package in.ashwanik.dcp.problems.p151_180.p177;

import in.ashwanik.dcp.common.ListNode;

class Solution {
    ListNode<Integer> rotate(ListNode<Integer> head, int k) {
        if (head == null || k <= 0) {
            return head;
        }

        ListNode<Integer> slow = head;
        ListNode<Integer> fast = head;

        ListNode<Integer> prev = null;

        int count = 0;
        while (count < k) {
            fast = fast.getNext();
            count++;
        }
        ListNode<Integer> last = null;
        while (fast != null) {
            prev = slow;
            slow = slow.getNext();
            if (fast.getNext() == null) {
                last = fast;
            }
            fast = fast.getNext();
        }
        if (prev != null) {
            prev.setNext(null);
        }
        if (last != null) {
            last.setNext(head);
        }
        return slow;
    }
}