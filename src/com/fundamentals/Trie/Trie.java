package com.fundamentals.Trie;

import static java.lang.Character.toLowerCase;

public class Trie {
    Node root;

    public Trie() {
        this.root = new Node();
    }

    public void insert(String key) {
        int index = 0;
        Node current = this.root;
        for (int i = 0; i < key.length(); i++) {
            index = toLowerCase(key.charAt(i)) - 'a';
            if (current.children[index] == null) {
                current.children[index] = new Node();
            }
            current = current.children[index];
        }
        current.isEndOfWord = true;
    }

    public void printAllWords(Node root, StringBuilder sb) {
        if (root.isEndOfWord) {
            System.out.println(sb);
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                sb.append(getCharForNumber(i+1));
                Node current = root.children[i];
                printAllWords(current, sb);
                sb.deleteCharAt(sb.length() - 1);
                //Uncomment if printing index of character instead of character
                /*if(i >= 10){
                    sb.deleteCharAt(sb.length() - 1);
                }*/
            }
        }
    }

    private String getCharForNumber(int i) {
        return i >= 0 && i < 26 ? String.valueOf((char)(i + 96)) : null;
    }

    public boolean search(String key) {
        int index;
        Node current = root;
        for (int i = 0; i < key.length(); i++) {
            index = toLowerCase(key.charAt(i)) - 'a';
            if (current.children[index] == null)
                return false;
            current = current.children[index];
        }
        return current.isEndOfWord;
    }

}
