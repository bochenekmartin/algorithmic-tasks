package com.algorithmic.problems;

import com.algorithmic.model.TreeNode;

public class P101_SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
       return isMirror(root, root);
    }

    private boolean isMirror(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) {
            return true;
        }
        if (r1 != null && r2 == null || r1 == null) {
            return false;
        }
        if (r1.val != r2.val) {
            return false;
        }
        return isMirror(r1.left, r2.right) && isMirror(r1.right, r2.left);
    }

}
