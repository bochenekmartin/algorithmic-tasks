package com.algorythmic.tasks.hackerrank;

import com.algorythmic.tasks.utils.Tree;

public class Start {

    public static void main(String args[]) {
        BinaryTree tree = Tree.createExampleTree();
        int height = tree.findHeight();
        int heightNoRecursive = tree.findHeightNoRecursive();

        System.out.println("height: " + height);
        System.out.println("height no recursive: " + heightNoRecursive);
        System.out.println("preorder: ");
        tree.preorder();
        System.out.println();
        tree.preorderIter(tree.getRoot());
        System.out.println("\ninorder: ");
        tree.inorder();
        System.out.println("\ninorder iter: ");
        tree.inorderIter(tree.getRoot());
        System.out.println("\npostorder: ");
        tree.postorder();
        System.out.println("\nlevel order: ");
        tree.levelOrderTraversal(tree.getRoot());
        System.out.println("\nleafs: " + tree.numberOfLeafs(tree.getRoot()));
        tree.leafs(tree.getRoot());
        System.out.println("\nis BST: " + tree.checkBST(tree.getRoot()));

    }

}
