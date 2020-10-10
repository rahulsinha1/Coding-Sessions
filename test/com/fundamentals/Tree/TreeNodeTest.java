package com.fundamentals.Tree;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class TreeNodeTest {

    @Test
    public void TreeTest()
    {
        TreeNode tree = new TreeNode(15);
        tree.insert(7);
        tree.insert(3);
        tree.insert(9);
        tree.insert(11);
        tree.insert(17);
        tree.insert(16);
        tree.insert(19);
        tree.traverseInOrder();
        System.out.println("********************");
        tree.traversePreOrder();
        System.out.println("********************");
        tree.traversePostOrder();
    }

}