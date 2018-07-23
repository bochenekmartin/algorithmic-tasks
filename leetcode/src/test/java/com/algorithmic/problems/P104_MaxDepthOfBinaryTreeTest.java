package com.algorithmic.problems;

import com.algorithmic.model.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class P104_MaxDepthOfBinaryTreeTest {

    P104_MaxDepthOfBinaryTree test = new P104_MaxDepthOfBinaryTree();

    @Test
    void maxDepth() {
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

        int result = test.maxDepth(root);

        assertEquals(3, result);
    }
}