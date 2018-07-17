package com.algorithmic.problems.trees.utils;

import com.algorithmic.model.BinaryTree;
import com.algorithmic.model.Node;

public class ExampleTree {

    private ExampleTree() {
    }

    public static BinaryTree createExampleTree() {
        Node n1 = new Node(5);
        Node n2 = new Node(17);
        Node n3 = new Node(12);
        Node n4 = new Node(20);

        BinaryTree tree = new BinaryTree(10);
        tree.getRoot().setLeft(n1);
        tree.getRoot().setRight(n2);
        n2.setLeft(n3);
        n2.setRight(n4);
        n1.setLeft(new Node(1));
        n1.setRight(new Node(8));


/*
          10
         /\
        5  17
       /\   /\
      1 8  12  20


 */
        return tree;
    }
}
