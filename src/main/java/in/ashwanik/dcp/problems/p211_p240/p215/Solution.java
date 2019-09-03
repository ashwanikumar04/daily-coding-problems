package in.ashwanik.dcp.problems.p211_p240.p215;

import in.ashwanik.dcp.common.TreeNode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

class Solution {

    Collection<Integer> getBottomView(TreeNode<Integer> root) {
        List<Integer> values = new ArrayList<>();
        if (root == null) {
            return values;
        }
        Map<Integer, Integer> map = new TreeMap<>();
        populate(root, map, 0);
        return map.values();
    }

    private void populate(TreeNode<Integer> root, Map<Integer, Integer> map, int distance) {
        if (root == null) {
            return;
        }

        map.put(distance, root.getData());
        populate(root.getLeft(), map, distance - 1);
        populate(root.getRight(), map, distance + 1);
    }
}