package com.fundamentals;

import com.fundamentals.LinkedList.EmptyListException;
import com.fundamentals.LinkedList.SinglyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SinglyLinkedListTest {

    //Creating LinkedList of several types and inserting elements
    @Test
    void testLinkedListInsertion() {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.insert(2);
        list.insert(4);
        list.insert(8);
        assertEquals(list.getSize(),3);
        System.out.println("**********************");
        SinglyLinkedList<String> StringList = new SinglyLinkedList<>();
        StringList.insert("Rahul");
        StringList.insert("Sinha");
        assertEquals(StringList.getSize(),2);
    }

    //Remove last element from linkedinList
    @Test
    void removeLastElement()
    {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.insert(2);
        list.insert(4);
        list.insert(8);
        list.displayList();
        assertEquals(list.getSize(),3);
        list.removeLast();
        assertEquals(list.getSize(),2);
    }

    //Test to check removal of element from empty linkedList
    @Test
    void removeLastElementEmptyList()
    {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        assertEquals(list.getSize(),0);
        Throwable exception = assertThrows(EmptyListException.class, () -> list.removeLast());
        assertEquals("Linked List is already empty", exception.getMessage());
    }

    //Test to check removal of element from nth position in linkedList
    @Test
    void removeNthElementList()
    {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.insert(2);
        list.insert(4);
        list.insert(8);
        list.insert(16);
        list.insert(32);
        list.displayList();
        System.out.println("\n******************************************\n");
        assertEquals(list.getSize(),5);
        list.removeFromNthPosition(5);
        list.displayList();
        //assertEquals(list.getSize(),2);
    }

    //Test to check removal of element from nth position in linkedList when index is more than size
    @Test
    void removeNthElementListIndexGreater()
    {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.insert(2);
        list.insert(4);
        list.insert(8);
        list.insert(16);
        list.insert(32);
        list.displayList();
        System.out.println("\n******************************************\n");
        assertEquals(list.getSize(),5);
        Throwable exception = assertThrows(IndexOutOfBoundsException.class, () -> list.removeFromNthPosition(6));
        assertEquals("Index is greater than size of linkedlist", exception.getMessage());
        list.displayList();
    }
}