package in.ashwanik.dcp.problems.p11;

import java.util.*;

class Solution {

    static class Node {
        Node[] nodes = new Node[26];
        boolean isEnd;
        String word;
    }

    private Node root;

    public Solution() {
        root = new Node();
    }


    void preprocess(Set<String> dictionary) {
        for (String word : dictionary) {
            add(word);
        }
    }

    private void add(String word) {
        char[] chars = word.toCharArray();
        Node current = root;
        for (char ch : chars) {
            Node currentNode = current.nodes[ch - 'a'];
            if (currentNode == null) {
                currentNode = new Node();
                current.nodes[ch - 'a'] = currentNode;
            }
            current = currentNode;
        }
        current.isEnd = true;
        current.word = word;
    }

    List<String> search(String search) {
        List<String> foundWords = new ArrayList<>();
        char[] chars = search.toCharArray();
        Node current = root;
        for (char ch : chars) {
            current = current.nodes[ch - 'a'];
        }
        if (current != null) {
            if (current.isEnd) {
                foundWords.add(current.word);
            }
            addWords(current, foundWords);
        }
        return foundWords;

    }


    private void addWords(Node current, List<String> words) {
        for (int index = 0; index < 26; index++) {
            if (current.nodes[index] != null) {
                if (current.nodes[index].isEnd) {
                    words.add(current.nodes[index].word);
                }
                addWords(current.nodes[index], words);
            }
        }
    }


    public static void main(String[] args) {

    }
}


