package in.ashwanik.dcp.problems.p61_90.p78;

import in.ashwanik.dcp.common.ListNode;

import java.util.List;

class Solution {
    /// 0 1 2 3 4
    /// 1 2 3 4 5
    ///(1,2) (3,4) 5
    ListNode<Integer> mergeList(List<ListNode<Integer>> lists) {
        if (lists == null || lists.isEmpty()) {
            return null;
        }
        if (lists.size() == 1) {
            return lists.get(0);
        }

        int interval = 1;
        while (interval < lists.size()) {
            for (int index = 0; index + interval < lists.size(); index = index + interval * 2) {
                lists.set(index, mergeTwoList(lists.get(index), lists.get(index + interval)));
            }
            interval = interval * 2;
        }
        return lists.get(0);
    }

    private ListNode<Integer> mergeTwoList(ListNode<Integer> first, ListNode<Integer> second) {
        ListNode<Integer> firstHead = first;
        ListNode<Integer> secondHead = second;

        if (firstHead == null && secondHead == null) {
            return firstHead;
        }
        if (firstHead == null) {
            return secondHead;
        }
        if (secondHead == null) {
            return firstHead;
        }
        ListNode<Integer> head = new ListNode<>(0);
        ListNode<Integer> result = head;
        while (firstHead != null && secondHead != null) {
            if (firstHead.getData() < secondHead.getData()) {
                head.setNext(firstHead);
                firstHead = firstHead.getNext();
            } else {
                head.setNext(secondHead);
                secondHead = secondHead.getNext();
            }
            head = head.getNext();
        }
        if (firstHead == null) {
            head.setNext(secondHead);
        }
        if (secondHead == null) {
            head.setNext(firstHead);
        }
        return result.getNext();
    }
}