package in.ashwanik.dcp.problems.p121_150.p145;

import in.ashwanik.dcp.common.ListNode;

class Solution {

    ListNode<Integer> reverse(ListNode<Integer> head, int nodeCount) {
        if (head == null) {
            return null;
        }

        ListNode<Integer> current = head;
        ListNode<Integer> prev = null;
        ListNode<Integer> next = null;
        int k = 0;
        while (current != null && k < nodeCount) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
            k++;
        }
        if (next != null) {
            head.setNext(reverse(next, nodeCount));
        }
        return prev;
    }

}