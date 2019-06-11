package in.ashwanik.dcp.problems.p61_90.p73;

import in.ashwanik.dcp.common.ListNode;

class Solution {
    ListNode<Integer> reverse(ListNode<Integer> head) {
        if (head == null) {
            return null;
        }
        ListNode<Integer> current = head;
        ListNode<Integer> previous = null;
        ListNode<Integer> next;

        while (current != null) {
            next = current.getNext();
            current.setNext(previous);
            previous = current;
            current = next;
        }
        return previous;
    }
}
