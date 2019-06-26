package in.ashwanik.dcp.problems.p91_120.p104;

import in.ashwanik.dcp.common.ListNode;

class Solution {

    //1 2 3 2 1
    //1 2 3 3 2 1

    boolean isPalindrome(ListNode<Integer> head) {
        if (head == null) {
            return true;
        }

        ListNode<Integer> slow = head;
        ListNode<Integer> fast = head;

        while (fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }

        boolean isOdd = fast != null;
        if (isOdd) {
            return compareLists(slow.getPrev(), slow.getNext());
        } else {
            return compareLists(slow.getPrev(), slow);
        }
    }

    boolean compareLists(ListNode<Integer> left, ListNode<Integer> right) {
        ListNode<Integer> leftCurrent = left;
        ListNode<Integer> rightCurrent = right;
        while (leftCurrent != null && rightCurrent != null) {
            if (leftCurrent.getData().equals(rightCurrent.getData())) {
                leftCurrent = leftCurrent.getPrev();
                rightCurrent = rightCurrent.getNext();
            } else {
                return false;
            }
        }
        return leftCurrent == null && rightCurrent == null;
    }
}