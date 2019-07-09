package in.ashwanik.dcp.problems.p121_p150.p127;

import in.ashwanik.dcp.common.ListNode;

class Solution {
    ListNode<Integer> add(ListNode<Integer> first, ListNode<Integer> second) {
        if (first == null && second == null) {
            return null;
        }

        if (first == null) {
            return second;
        }
        if (second == null) {
            return first;
        }

        ListNode<Integer> dummy = new ListNode<>(-1);
        ListNode<Integer> result = dummy;
        int carry = 0;
        ListNode<Integer> firstCurrent = first;
        ListNode<Integer> secondCurrent = second;

        while (firstCurrent != null || secondCurrent != null) {
            int sum = (firstCurrent == null ? 0 : firstCurrent.getData()) + (secondCurrent == null ? 0 : secondCurrent.getData()) + carry;
            ListNode<Integer> newNode = new ListNode<>(sum % 10);
            carry = sum / 10;
            if (firstCurrent != null) {
                firstCurrent = firstCurrent.getNext();
            }
            if (secondCurrent != null) {
                secondCurrent = secondCurrent.getNext();
            }
            dummy.setNext(newNode);
            dummy = dummy.getNext();
        }
        if (carry != 0) {
            ListNode<Integer> newNode = new ListNode<>(carry);
            dummy.setNext(newNode);
        }
        return result.getNext();
    }
}