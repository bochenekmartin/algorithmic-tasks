package com.algorithmic.utils;

import com.algorithmic.model.TreeNode;

public class Trees {

    private Trees() {
    }

    public static TreeNode createUnbalancedTree() {
          /*
        1
       / \
      2   3
     / |
    4   5
     \
      10
        */

        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode left1 = new TreeNode(4);
        left1.right = new TreeNode(10);
        left.left = left1;
        left.right = new TreeNode(5);
        root.left = left;
        root.right = new TreeNode(3);
        return root;
    }

    public static TreeNode createT1() {
          /*
        1
       / \
      2   3
     / |
    4  5
        */

        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        left.left = new TreeNode(4);
        left.right = new TreeNode(5);
        root.left = left;
        root.right = new TreeNode(3);
        return root;
    }

    public static TreeNode createT2() {
          /*

        1
       / \
      2   3
     / |   \
    4  5    10
        */
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        left.left = new TreeNode(4);
        left.right = new TreeNode(5);
        root.left = left;
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(10);
        return root;
    }

    public static TreeNode createSymmetric() {
          /*

        1
       / \
      2   2
     /    \
    3      3
   /        \
  4          4
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        return root;
    }

    public static TreeNode createT4() {
          /*

        1
       / \
      2   3
     /    /
    3    2
        */
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(2);
        return root;
    }

    public static TreeNode createSymmetric2() {
          /*

         1
       /  \
      2     2
     / |   / \
    4  5   5  4
            */
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        left.left = new TreeNode(4);
        left.right = new TreeNode(5);
        root.left = left;
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(4);
        return root;
    }
}
