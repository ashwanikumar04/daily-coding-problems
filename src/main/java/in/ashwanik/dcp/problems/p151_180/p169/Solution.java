package in.ashwanik.dcp.problems.p151_180.p169;

import in.ashwanik.dcp.common.ListNode;

class Solution {

    ListNode<Integer> sort(ListNode<Integer> head) {
        if (head == null || head.getNext() == null) {
            return head;
        }

        ListNode<Integer> middle = getMiddle(head);
        ListNode<Integer> nextOfMiddle = middle.getNext();
        middle.setNext(null);
        ListNode<Integer> left = sort(head);
        ListNode<Integer> right = sort(nextOfMiddle);
        return merge(left, right);
    }

    private ListNode<Integer> merge(ListNode<Integer> left, ListNode<Integer> right) {
        if (left == null && right == null) {
            return null;
        }
        if (left == null) {
            return right;
        }
        if (right == null) {
            return left;
        }
        ListNode<Integer> dummy = new ListNode<>(-1);
        ListNode<Integer> leftCurrent = left;
        ListNode<Integer> rightCurrent = right;
        ListNode<Integer> result = dummy;
        while (leftCurrent != null && rightCurrent != null) {
            if (leftCurrent.getData() < rightCurrent.getData()) {
                dummy.setNext(leftCurrent);
                leftCurrent = leftCurrent.getNext();
            } else {
                dummy.setNext(rightCurrent);
                rightCurrent = rightCurrent.getNext();
            }
            dummy = dummy.getNext();
        }
        if (leftCurrent == null) {
            dummy.setNext(rightCurrent);
        }
        if (rightCurrent == null) {
            dummy.setNext(leftCurrent);
        }
        return result.getNext();
    }

    private ListNode<Integer> getMiddle(ListNode<Integer> node) {
        if (node == null) {
            return null;
        }
        ListNode<Integer> slow = node;
        ListNode<Integer> fast = node.getNext();
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }
}