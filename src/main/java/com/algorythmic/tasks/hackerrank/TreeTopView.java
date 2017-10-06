package com.algorythmic.tasks.hackerrank;

import com.algorythmic.tasks.utils.Node;
import com.algorythmic.tasks.utils.Tree;

public class TreeTopView {

    public static void main(String[] args) {
        BinaryTree exampleTree = Tree.createExampleTree();
        new TreeTopView().topView(exampleTree.getRoot());
    }

    /*

   class Node
      int data;
      Node left;
      Node right;
  */
    void topView(Node root) {
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

    void leftTopView(Node root) {
        if (root == null) {
            return;
        }
        leftTopView(root.left);
        System.out.print(root.getData() + " ");

    }

    void rightTopView(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getData() + " ");
        rightTopView(root.right);
    }

}
