package in.ashwanik.dcp.problems.p121_p150.p131;

import in.ashwanik.dcp.common.ListNode;

class Solution {

    static class RandomListNode<T> extends ListNode<T> {

        private ListNode<T> random;

        public RandomListNode(T data) {
            super(data);
        }

        public ListNode<T> getRandom() {
            return random;
        }

        public void setRandom(ListNode<T> random) {
            this.random = random;
        }
    }


    RandomListNode<Integer> getClonedList(RandomListNode<Integer> head) {
        if (head == null) {
            return null;
        }

        ListNode<Integer> current = head;


        while (current != null) {
            RandomListNode<Integer> clone = new RandomListNode<>(current.getData());
            ListNode<Integer> next = current.getNext();
            current.setNext(clone);
            clone.setNext(next);
            current = next;
        }

        current = head;

        while (current != null) {
            if (current.getNext() != null) {
                ((RandomListNode<Integer>) current.getNext())
                        .setRandom(((RandomListNode<Integer>) current).getRandom() == null
                                ? null : ((RandomListNode<Integer>) current).getRandom().getNext());
            }
            current = current.getNext() == null ? current.getNext() : current.getNext().getNext();
        }

        current = head;
        ListNode<Integer> copy = current.getNext();
        ListNode<Integer> result = copy;
        while (current != null && copy != null) {
            current.setNext(current.getNext() == null ? current.getNext() : current.getNext().getNext());
            copy.setNext(copy.getNext() == null ? copy.getNext() : copy.getNext().getNext());
            copy = copy.getNext();
            current = current.getNext();
        }
        return (RandomListNode<Integer>) result;
    }


}