package com.fundamentals;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Stack<T> {

    private int top;
    private int size;
    private T[] elements;
    public Stack(int size) {
        this.size = size;
        this.elements = (T[]) new Object[size];
        this.top =0;
    }

    public void push(T data)
    {
        if(top>=size)
        {
            throw new StackOverflowError("Stack Overflow");
        }
        elements[top++] = data;
    }

    public T pop()
    {
        System.out.println("top is" + top);
        T element = elements[--top];
        elements[top--] = null;
        return element;
    }

    public T peek()
    {
        return elements[top];
    }

    public boolean isEmpty()
    {
        boolean flag = false;
        if (top == 0)
            flag = true;
        return flag;
    }

    @Override
    public String toString() {
        return "Stack : " +
                "size=" + size +
                "\nElements=" + Arrays.toString(elements) +
                '}';
    }

    public static void main(String args[])
    {
        Stack<Integer> stack = new Stack<>(3);
        stack.push(6);
        stack.push(7);
        stack.push(9);
        stack.pop();
        stack.pop();
        stack.pop();
        //System.out.println(stack.pop());
        System.out.println(stack.toString());
    }

}
