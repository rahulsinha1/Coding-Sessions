package com.fundamentals.LinkedList;

public class SinglyLinkedList<T> {
    private Node<T> head;

    public SinglyLinkedList() {
    }

    public void insert(T data) {
        Node<T> node = new Node<T>(data);
        if(this.head == null)
        {
            this.head = node;
        }
        else
        {
            Node currNode = this.head;
            while(currNode.getNext()!= null)
            {
                currNode = currNode.getNext();
            }
            currNode.setNext(node);
        }
    }

    public void removeLast()
    {
        if(this.head == null)
        {
            throw new EmptyListException("Linked List is already empty");
        }
        else
        {
            Node currNode = this.head;
            while(currNode.getNext().getNext()!=null)
            {
                currNode = currNode.getNext();
            }
            currNode.setNext(null);

        }
    }


    public void removeFromNthPosition(int index)
    {
        int count =1;
        if(this.head == null)
        {
            throw new EmptyListException("Linked List is already empty");
        }
        if(index == 1 )
        {
            this.head = this.head.getNext();
        }
        else
        {
            //CurrNode will initially point to the head of the list
            Node currNode = this.head;
            while(count<index-1 && currNode!=null)
            {
                currNode = currNode.getNext();
                count++;
            }
            if(currNode == null || currNode.getNext() ==null)
            {
                throw new IndexOutOfBoundsException("Index is greater than size of linkedlist");
            }
            Node temp = currNode.getNext().getNext();
            currNode.setNext(temp);
        }
    }

    public void displayList()
    {
        Node currNode = this.head;
        while(currNode!= null)
        {
            System.out.println(currNode.getData());
            currNode = currNode.getNext();
        }
    }

    public int getSize()
    {
        Node currNode = this.head;
        int count=0;
        if(currNode == null)
            return count;
        else
        {
            while(currNode!=null)
            {
                currNode = currNode.getNext();
                count ++;
            }
        }
        return count;
    }
}

