package com.fundamentals.Tree;

public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public void insert(int value) {
        if (value <= data) {
            if (left != null) {
                left.insert(value);
            } else {
                left = new TreeNode(value);
            }
        } else {
            if (right != null) {
                right.insert(value);
            } else {
                right = new TreeNode(value);
            }
        }
    }

    public boolean findElement(int key) {
        if (key == data) {
            return true;
        } else if (key < data) {
            if (left == null)
                return false;
            return left.findElement(key);
        } else {
            if (right == null)
                return false;
            return right.findElement(key);
        }
    }

    public void traverseInOrder() {
        if (left != null) {
            left.traverseInOrder();
        }
        System.out.print(data+" ");
        if (right != null) {
             right.traverseInOrder();
        }
    }

    public void traversePreOrder()
    {
        System.out.print(data+" ");
        if(left!= null)
        {
            left.traversePreOrder();
        }
        if(right!=null)
        {
            right.traversePreOrder();
        }
    }

    public void traversePostOrder ()
    {
        if(left!= null)
        {
            left.traversePostOrder();
        }
        if(right!=null)
        {
            right.traversePostOrder();
        }
        System.out.print(data+" ");
    }
}
