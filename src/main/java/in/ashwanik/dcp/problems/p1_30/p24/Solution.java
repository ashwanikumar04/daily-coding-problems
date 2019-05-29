package in.ashwanik.dcp.problems.p1_30.p24;

class Solution {

    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode parent;
        boolean isLocked;
        int numberOfLockedNodes;
    }

    boolean isLocked(TreeNode treeNode) {
        return treeNode != null && treeNode.isLocked;
    }

    boolean canLockOrUnlock(TreeNode treeNode) {
        if (treeNode.isLocked) {
            return false;
        }

        TreeNode curent = treeNode.parent;

        while (curent != null) {
            if (curent.isLocked) {
                return false;
            }
            curent = curent.parent;
        }

        return true;
    }

    boolean lock(TreeNode treeNode) {
        if (treeNode == null) {
            return false;
        }

        if (canLockOrUnlock(treeNode)) {
            treeNode.isLocked = true;
            TreeNode current = treeNode.parent;
            while (current != null) {
                current.numberOfLockedNodes += 1;
                current = current.parent;
            }
            return true;
        } else {
            return false;
        }
    }


    boolean unlock(TreeNode treeNode) {
        if (treeNode == null) {
            return false;
        }

        if (canLockOrUnlock(treeNode)) {
            treeNode.isLocked = false;
            TreeNode current = treeNode.parent;
            while (current != null) {
                current.numberOfLockedNodes -= 1;
                current = current.parent;
            }
            return true;
        } else {
            return false;
        }
    }

}


