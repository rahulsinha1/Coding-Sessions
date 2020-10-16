package com.fundamentals.Trie;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    Trie trie;

    @BeforeEach
    void setup()
    {
        trie = new Trie();
    }
    //Test to verify if insertion of a word is successful in the Trie
    @Test
    void insert() {
        trie.insert("Foo");
        assertEquals(true,trie.search("Foo"));
    }

    //Test to verify if all the words in a trie are printed in ascending order.
    @Test
    void printAllWords() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        trie.insert("Foo");
        trie.insert("Bar");
        trie.insert("Rahul");
        trie.insert("Jackson");
        trie.printAllWords(trie.root,new StringBuilder());
        String expectedOutput ="bar\r\n" +
                "foo\r\n" +
                "jackson\r\n" +
                "rahul"+"\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    //Test to verify if a key which exists in trie is found in the trie by searching.
    @Test
    void searchForWordThatExists() {
        trie.insert("Foo");
        boolean found = trie.search("Foo");
        assertEquals(true,found);
    }

    //Test to verify if a key which does not exist in trie is not found.
    @Test
    void searchForWordThatDoesNotExist() {
        trie.insert("Bar");
        boolean found = trie.search("Foo");
        assertEquals(false,found);
    }
}