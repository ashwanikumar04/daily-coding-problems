package in.ashwanik.dcp.common;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class ListNode<T> {

    private T data;
    private ListNode<T> next;
    private ListNode<T> prev;

    public ListNode(T data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public ListNode(T data, ListNode<T> next) {
        this.data = data;
        this.next = next;
    }

    public ListNode(T data, ListNode<T> next, ListNode<T> prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public ListNode(List<T> list) {
        ListNode<T> current = this;
        current.data = list.get(0);
        for (int index = 1; index < list.size(); index++) {
            current.next = new ListNode<>(list.get(index));
            current.next.prev = current;
            current = current.getNext();
        }
    }

    public ListNode<T> getPrev() {
        return prev;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public ListNode<T> getNext() {
        return next;
    }

    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    public void print() {
        ListNode<T> current = this;
        while (current != null) {
            System.out.print(current.data + "\t");
            current = current.next;
        }
        System.out.println();
    }

    public T[] data() {
        List<T> values = new ArrayList<>();
        ListNode<T> current = this;
        while (current != null) {
            values.add(current.data);
            current = current.next;
        }
        return (T[]) new Object[values.size()];
    }

    public int length() {
        ListNode<T> current = this;
        int length = 0;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    @Override
    public String toString() {
        return data + "";
    }
}




