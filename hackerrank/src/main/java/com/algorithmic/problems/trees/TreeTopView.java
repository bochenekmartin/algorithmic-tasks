package com.algorithmic.problems.trees;

import com.algorithmic.model.BinaryTree;
import com.algorithmic.model.Node;
import com.algorithmic.problems.trees.utils.ExampleTree;

public class TreeTopView {

    public static void main(String... args) {
        BinaryTree exampleTree = ExampleTree.createExampleTree();
        new TreeTopView().topView(exampleTree.getRoot());
    }

    /*

   class Node
      int data;
      Node left;
      Node right;
  */
    private void topView(Node root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            leftTopView(root.getLeft());
        }
        System.out.print(root.getData() + " ");
        if (root.right != null) {
            rightTopView(root.right);
        }

    }

    private void leftTopView(Node root) {
        if (root == null) {
            return;
        }
        leftTopView(root.left);
        System.out.print(root.getData() + " ");

    }

    private void rightTopView(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getData() + " ");
        rightTopView(root.right);
    }

}
