package com.fundamentals.Trie;

public class Node {
    public Node[] getChildren() {
        return children;
    }

    public void setChildren(Node[] children) {
        this.children = children;
    }

    public boolean isEndOfWord() {
        return isEndOfWord;
    }

    public void setEndOfWord(boolean endOfWord) {
        isEndOfWord = endOfWord;
    }

    Node[] children = new Node[26];
    boolean isEndOfWord;

    public Node() {
        isEndOfWord = false;
        for (int i = 0; i < 26; i++) {
            children[i] = null;
        }

    }

}
