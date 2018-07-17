package com.algorithmic.problems.trees;

import com.algorithmic.model.BinaryTree;
import com.algorithmic.model.Node;
import com.algorithmic.problems.trees.utils.ExampleTree;

public class PreorderTraversal {

    public static void main(String... args) {
        BinaryTree exampleTree = ExampleTree.createExampleTree();
    }

    void preOrder(Node root) {
        if (root == null) {
            return;
        }
        int i = 1;
        if (i == 1) {
            System.out.print(root.getKey());
        } else {
            i++;
            System.out.println(" " + root.getKey());
        }
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    static boolean booleanFlag = true;

    void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        if (booleanFlag) {
            booleanFlag = false;
            System.out.print(root.data);
        } else {
            System.out.print(" " + root.data);
        }

    }
}
