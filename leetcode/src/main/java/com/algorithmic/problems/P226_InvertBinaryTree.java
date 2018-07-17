package com.algorithmic.problems;

import com.algorithmic.model.TreeNode;

public class P226_InvertBinaryTree {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        invertTree(root.right);
        invertTree(root.left);

        return root;
    }
}