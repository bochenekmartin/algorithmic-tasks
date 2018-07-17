package com.algorithmic.problems.trees;

import com.algorithmic.model.BinaryTree;
import com.algorithmic.model.Node;
import com.algorithmic.problems.trees.utils.ExampleTree;

public class TreeInsert {

    public static void main(String... args) {
        BinaryTree exampleTree = ExampleTree.createExampleTree();
        //todo insert


        TreeInsert treeInsert = new TreeInsert();
        treeInsert.inorder(exampleTree.getRoot());
        treeInsert.insert(exampleTree.getRoot(), 11);
        System.out.println();
        System.out.println();
        treeInsert.inorder(exampleTree.getRoot());


        System.out.println();
    }

    private void inorder(Node r) {
        if (r == null) {
            return;
        }
        inorder(r.getLeft());
        System.out.print(r.data() + " ");
        inorder(r.getRight());

    }

    private void insert(Node node, int value) {
        if (node == null) {
            return;
        }

        if (value < node.data) {
            if (node.left == null) {
                node.left = new Node(value);
            } else {
                insert(node.left, value);
            }
        } else {
            if (node.right == null) {
                node.right = new Node(value);
            } else {
                insert(node.right, value);
            }
        }

    }


    private void insert2(Node node, int value) {
        if (node == null) {
            return;
        }

        if (value < node.data) {
            if (node.left == null) {
                node.left = new Node(value);
            } else {
                insert(node.left, value);
            }
        }
        if (value > node.data) {
            if (node.right == null) {
                node.right = new Node(value);
            } else {
                insert(node.right, value);
            }
        }

    }
}
