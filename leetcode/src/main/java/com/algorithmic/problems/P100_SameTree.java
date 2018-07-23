package com.algorithmic.problems;

import com.algorithmic.model.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class P100_SameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }

    public boolean isSameTree2(TreeNode p, TreeNode q) {
        List<Integer> pList = new LinkedList<>();
        List<Integer> qList = new LinkedList<>();

        preorder(p, pList);
        preorder(q, qList);
        return pList.equals(qList);
    }

    private void preorder(TreeNode p, List<Integer> list) {
        if (p == null) {
            list.add(null);
            return;
        }
        list.add(p.val);
        preorder(p.left, list);
        preorder(p.right, list);
    }

}
