package in.ashwanik.dcp.problems.p1_30.p26;

import in.ashwanik.dcp.common.ListNode;

class Solution {

    ListNode<Integer> getKthNodeFromLast(ListNode<Integer> head, int k) {
        if (head == null) {
            return null;
        }

        ListNode<Integer> first = head;

        int count = 0;
        while (count < k) {
            first = first.getNext();
            count++;
        }

        ListNode<Integer> second = head;

        while (first != null) {
            first = first.getNext();
            second = second.getNext();
        }

        return second;

    }
}


