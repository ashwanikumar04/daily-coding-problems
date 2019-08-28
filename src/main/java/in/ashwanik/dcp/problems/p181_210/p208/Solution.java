package in.ashwanik.dcp.problems.p181_210.p208;

import in.ashwanik.dcp.common.ListNode;

class Solution {

    ListNode<Integer> partition(ListNode<Integer> head, int k) {
        if (head == null || head.getNext() == null) {
            return head;
        }

        ListNode<Integer> beforeHead = null;
        ListNode<Integer> beforeTail = null;
        ListNode<Integer> afterHead = null;
        ListNode<Integer> afterTail = null;

        ListNode<Integer> current = head;
        while (current != null) {
            if (current.getData() < k) {
                if (beforeHead == null) {
                    beforeHead = current;
                }
                if (beforeTail == null) {
                    beforeTail = current;
                } else {
                    beforeTail.setNext(current);
                    beforeTail = current;
                }
            } else {
                if (afterHead == null) {
                    afterHead = current;
                }
                if (afterTail == null) {
                    afterTail = current;
                } else {
                    afterTail.setNext(current);
                    afterTail = current;
                }
            }
            current = current.getNext();
        }
        if (afterHead != null) {
            afterTail.setNext(null);
        }
        if (beforeHead == null) {
            return afterHead;
        } else {
            beforeTail.setNext(afterHead);
            return beforeHead;
        }
    }
}