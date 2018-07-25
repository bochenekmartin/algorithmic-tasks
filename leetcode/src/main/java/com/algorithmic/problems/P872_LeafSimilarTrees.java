package com.algorithmic.problems;

import com.algorithmic.model.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class P872_LeafSimilarTrees {

    private List<Integer> l1 = new LinkedList<>();
    private List<Integer> l2 = new LinkedList<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        traverse(root1, l1);
        traverse(root2, l2);
        return l1.equals(l2);
    }

    private void traverse(TreeNode root, List<Integer> l) {
        if (root == null) {
            return;
        }
        traverse(root.left, l);
        if (root.left == null && root.right == null) {
            l.add(root.val);
            return;
        }
        traverse(root.right, l);
    }


}
