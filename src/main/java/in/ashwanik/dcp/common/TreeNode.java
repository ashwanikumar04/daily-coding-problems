package in.ashwanik.dcp.common;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 */
public class TreeNode<T> {

    private T data;
    private TreeNode<T> left;
    private TreeNode<T> right;

    public TreeNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public TreeNode(T data, TreeNode<T> left, TreeNode<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public TreeNode<T> getRight() {
        return right;
    }

    public void setRight(TreeNode<T> right) {
        this.right = right;
    }

    public TreeNode<T> getLeft() {
        return left;
    }

    public void setLeft(TreeNode<T> left) {
        this.left = left;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void printTree() {
        Queue<TreeNode<T>> queue = new LinkedList<>();

        queue.add(this);
        queue.add(null);
        while (!queue.isEmpty()) {
            TreeNode<T> current = queue.remove();
            if (current == null) {
                if (!queue.isEmpty()) {
                    queue.add(null);
                    System.out.print("\n");
                }
            } else {
                System.out.print(current.data + "\t");
                if (current.getLeft() != null) {
                    queue.add(current.getLeft());
                }
                if (current.getRight() != null) {
                    queue.add(current.getRight());
                }
            }

        }
        System.out.print("\n");
        System.out.print("\n");
    }

    @Override
    public String toString() {
        return data + "";
    }
}




