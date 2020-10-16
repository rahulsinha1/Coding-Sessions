package com.fundamentals.Trie;

import java.util.TreeSet;

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

    //TreeSet<Character> nodes;
     Node [] children = new Node[26];
     boolean isEndOfWord;

    public Node() {
       // this.nodes = new TreeSet<>(Character::compareTo);
        isEndOfWord = false;
        for(int i=0; i<26;i++)
        {
            children[i] = null;
        }

    }

}
