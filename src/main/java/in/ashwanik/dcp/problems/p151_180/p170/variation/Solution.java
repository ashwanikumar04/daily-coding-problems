package in.ashwanik.dcp.problems.p151_180.p170.variation;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {

    private Set<String> dictionary;

    private Map<String, List<String>> graph;

    Solution(Set<String> dictionary) {
        this.dictionary = dictionary;
        graph = new HashMap<>();
        createGraph();
    }

    List<String> getTransformation(String from, String to) {
        Deque<List<String>> queue = new ArrayDeque<>();
        Set<String> searched = new HashSet<>();
        List<String> path = new ArrayList<>();
        path.add(from);
        queue.offer(path);
        while (!queue.isEmpty()) {
            List<String> current = queue.remove();
            String currentWord = current.get(current.size() - 1);
            if (currentWord.equals(to)) {
                return current;
            }
            List<String> transforms = graph.get(currentWord);
            for (String transform : transforms) {
                if (!current.contains(transform) && !searched.contains(transform)) {
                    List<String> newPath = new ArrayList<>(current);
                    newPath.add(transform);
                    searched.add(transform);
                    queue.offer(newPath);
                }
            }
        }
        return null;
    }

    private void createGraph() {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        for (String str : dictionary) {
            for (int index = 0; index < str.length(); index++) {
                addPathForDeleting(str, index);
                addPathForChanging(letters, str, index);
                addPathForAdding(letters, str, index);
            }
        }
    }

    private void addPathForDeleting(String str, int index) {
        StringBuilder deleteBuilder = new StringBuilder(str);
        String deleted = deleteBuilder.deleteCharAt(index).toString();
        if (dictionary.contains(deleted)) {
            appendPath(str, deleted);
        }
    }

    private void addPathForChanging(String letters, String str, int index) {
        for (int letterIndex = 0; letterIndex < letters.length(); letterIndex++) {
            StringBuilder changeBuilder = new StringBuilder(str);
            changeBuilder.setCharAt(index, letters.charAt(letterIndex));
            String changed = changeBuilder.toString();
            if (dictionary.contains(changed) && !changed.equalsIgnoreCase(str)) {
                appendPath(str, changed);
            }
        }
    }

    private void addPathForAdding(String letters, String str, int index) {
        for (int letterIndex = 0; letterIndex < letters.length(); letterIndex++) {
            StringBuilder addBuilder = new StringBuilder(str);
            addBuilder.insert(index, letters.charAt(letterIndex));
            String added = addBuilder.toString();
            if (dictionary.contains(added) && !added.equalsIgnoreCase(str)) {
                appendPath(str, added);
            }
        }
    }

    private void appendPath(String to, String from) {
        graph.putIfAbsent(to, new ArrayList<>());
        graph.get(to).add(from);
    }

}