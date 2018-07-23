package com.algorithmic.problems;

import com.algorithmic.model.TreeNode;

public class P104_MaxDepthOfBinaryTree {

    public int maxDepth(TreeNode root) {
        return height(root);
    }

    private int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }

}
