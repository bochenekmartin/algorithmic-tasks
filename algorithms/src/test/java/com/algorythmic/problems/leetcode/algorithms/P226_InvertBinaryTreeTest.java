package com.algorythmic.problems.leetcode.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P226_InvertBinaryTreeTest {

    @Test
    void invertTree() {
        TreeNode init = buildTree();

        TreeNode root = new P226_InvertBinaryTree().invertTree(init);
        assertEquals(root.val, 4);
        assertEquals(root.left.val ,7);
        assertEquals(root.left.left.val ,9);
        assertEquals(root.left.right.val ,6);
        assertEquals(root.right.val ,2);
        assertEquals(root.right.left.val ,3);
        assertEquals(root.right.right.val ,1);
    }

    private TreeNode buildTree() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        return root;
    }
}