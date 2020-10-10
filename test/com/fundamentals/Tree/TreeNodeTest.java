package com.fundamentals.Tree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

class TreeNodeTest {

    @Test
    //Test to create a tree and insert elements and do different types of traversals on the tree
    public void TreeTest() {
        TreeNode tree = new TreeNode(15);
        int[] list = {7, 3, 9, 11, 17, 16, 19};
        for (int i : list) {
            tree.insert(i);
        }
        System.out.println("Inorder Traversal");
        tree.traverseInOrder();
        System.out.println("\n********************\n");
        System.out.println("Preorder Traversal");
        tree.traversePreOrder();
        System.out.println("\n********************\n");
        System.out.println("Postorder Traversal");
        tree.traversePostOrder();
    }

    // Test to verify an element larger than root node is found in the tree if it exists
    @Test
    public void TestFindElement() {
        TreeNode tree = new TreeNode(15);
        int[] list = {7, 3, 9, 11, 17, 16, 19};
        for (int i : list) {
            tree.insert(i);
        }
        boolean result = tree.findElement(17);
        assertEquals(result, true);
    }

    // Test to verify an element smaleer than root node is found in the tree if it exists
    @Test
    public void TestFindElement2() {
        TreeNode tree = new TreeNode(15);
        int[] list = {7, 3, 9, 11, 17, 16, 19};
        for (int i : list) {
            tree.insert(i);
        }
        boolean result = tree.findElement(7);
        assertEquals(result, true);
    }

    // Test to verify an element is not found in the tree if it does not exist(Returns false)
    @Test
    public void TestFindElementThatDoesNotExist() {
        TreeNode tree = new TreeNode(15);
        int[] list = {7, 3, 9, 11, 17, 16, 19};
        for (int i : list) {
            tree.insert(i);
        }
        boolean result = tree.findElement(28);
        assertEquals(result, false);
        result = tree.findElement(2);
        assertEquals(result, false);
    }
}