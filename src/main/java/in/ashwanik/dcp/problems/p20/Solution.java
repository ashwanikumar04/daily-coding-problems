package in.ashwanik.dcp.problems.p20;

import in.ashwanik.dcp.common.ListNode;

class Solution {

    ListNode<Integer> getIntersectingNode(ListNode<Integer> first, ListNode<Integer> second) {
        if (first == null || second == null) {
            return null;
        }

        int firstLength = first.length();
        int secondLength = second.length();

        if (firstLength < secondLength) {
            return getIntersectingNode(second, first);
        }

        ListNode<Integer> current = first;
        int difference = firstLength - secondLength;
        while (difference > 0) {
            current = current.getNext();
            difference--;
        }
        ListNode<Integer> currentSecond = second;

        while (current != null && currentSecond != null) {
            if (current.getData() == currentSecond.getData()) {
                return current;
            }
            current = current.getNext();
            currentSecond = currentSecond.getNext();
        }
        return null;
    }
}


