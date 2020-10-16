package com.fundamentals.Trie;

import java.util.Iterator;

public class Trie {
    Node root;

    public Trie() {
        this.root = new Node();
    }

    public void insert(String key) {
        int index = 0;
        Node current = this.root;
        for (int i = 0; i < key.length(); i++) {
            index = key.charAt(i) - 'a';
            if (current.children[index] == null) {
                current.children[index] = new Node();
            }
            current = current.children[index];
        }
        current.setEndOfWord(true);
    }

    public void printAllWords(Node root, StringBuilder sb) {
        if(root.isEndOfWord)
        {
            System.out.println(sb);
        }
        for(int i=0;i<26;i++)
        {
            if(root.children[i]!=null)
            {
                sb.append(i+" ");
                Node current  = root.children[i];
                printAllWords(current,sb);
                for(int x=0;x<2;x++) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }
    }

 /*   private void printAllWords(Node current, StringBuilder curWord) {
        if(current.isEndOfWord) {
            System.out.println(curWord);
        }
        for(int i=0; i<26;i++)
        {
            if (current.children[i] != null) {
                curWord.append(i);
                printAllWords(current.children[i], curWord);
                curWord.deleteCharAt(curWord.length()-1);
            }
        }
    }
*/
   /* public void printAllWords(Node root) {
        printAllWordsRecursive(root, new StringBuilder(""));
    }*/

    public boolean search(String key) {
        int index;
        Node current = root;
        for (int i=0;i<key.length();i++)
        {
            index = key.charAt(i) - 'a';
            if(current.children[index] == null)
                return false;
            current = current.children[index];
        }
        return current.isEndOfWord;
    }

    public static void main(String args[]) {
        Trie sample = new Trie();
        sample.insert("many");
        sample.insert("abcd");
        sample.insert("man");
        System.out.println(sample.search("man"));
        System.out.println(sample.search("many"));
        System.out.println(sample.search("manyy"));
        sample.printAllWords(sample.root, new StringBuilder());
    }
}
