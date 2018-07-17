package com.algorithmic.problems.trees;


import com.algorithmic.model.BinaryTree;
import com.algorithmic.model.Node;
import com.algorithmic.problems.trees.utils.ExampleTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeMethods {

    private final Node root;


    public static void main(String... args) {
        BinaryTree bTree = ExampleTree.createExampleTree();
        BinaryTreeMethods methods = new BinaryTreeMethods(bTree);
        int height = methods.findHeight();
        int heightNoRecursive = methods.findHeightNoRecursive();

        System.out.println("height: " + height);
        System.out.println("height no recursive: " + heightNoRecursive);
        System.out.println("preorder: ");
        methods.preorder();
        System.out.println();
        methods.preorderIter(bTree.getRoot());
        System.out.println("\ninorder: ");
        methods.inorder();
        System.out.println("\ninorder iter: ");
//        methods.inorderIter(bTree.getRoot());
        System.out.println("\npostorder: ");
        methods.postorder();
        System.out.println("\nlevel order: ");
        methods.levelOrderTraversal(bTree.getRoot());
        System.out.println("\nleafs: " + methods.numberOfLeafs(bTree.getRoot()));
        methods.leafs(bTree.getRoot());
        System.out.println("\nis BST: " + methods.checkBST(bTree.getRoot()));

    }


    public BinaryTreeMethods(BinaryTree tree) {
        root = tree.getRoot();
    }

    public void addLeft(Node parent, Node child) {
        parent.setLeft(child);
    }

    public void addRight(Node parent, Node child) {
        parent.setLeft(child);
    }

    int findHeight() {
        return findHeight(root);
    }

    int findHeightNoRecursive() {
        if (root == null || (root.getLeft() == null && root.getRight() == null)) {
            return 0;
        }
        int depth = -1;

        List<Node> oneLayer = new ArrayList<>();
        oneLayer.add(root);

        while (!oneLayer.isEmpty()) {
            List<Node> newLayer = new ArrayList<>();
            for (Node node : oneLayer) {
                if (node.getRight() != null) {
                    newLayer.add(node.getRight());
                }
                if (node.getLeft() != null) {
                    newLayer.add(node.getLeft());
                }
            }
            oneLayer = newLayer;
            depth++;
        }

        return depth;
    }

    void preorderIter(Node root) {
        if (root == null) {
            return;
        }
        Deque<Node> stack = new ArrayDeque<>();
        stack.push(root);

        while (!stack.isEmpty()) {

            Node n = stack.pop();
            System.out.printf("%d ", n.getKey());


            if (n.getRight() != null) {
                stack.push(n.getRight());
            }
            if (n.getLeft() != null) {
                stack.push(n.getLeft());
            }

        }
    }

    public void postorder() {
        postorder(root);
    }

    private void postorder(Node root) {
        if (root != null) {
            //Visit the node by Printing the node data
            postorder(root.getLeft());
            postorder(root.getRight());
            System.out.printf("%d ", root.getKey());
        }
    }

    public void inorder() {
        inorder(root);
    }

    private void inorder(Node root) {
        if (root != null) {
            //Visit the node by Printing the node data
            inorder(root.getLeft());
            System.out.printf("%d ", root.getKey());
            inorder(root.getRight());
        }
    }

    void preorder() {
        preorder(root);
    }

    private void preorder(Node root) {
        if (root != null) {
            //Visit the node by Printing the node data
            System.out.printf("%d ", root.getKey());
            preorder(root.getLeft());
            preorder(root.getRight());
        }
    }

    public void leafs(Node root) {
        if (root != null) {
            if (root.getLeft() == null && root.getRight() == null) {
                System.out.print(root.getKey() + " ");
            } else {
                leafs(root.getLeft());
                leafs(root.getRight());
            }
        }
    }

    public int numberOfLeafs(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        } else {
            return numberOfLeafs(root.left) + numberOfLeafs(root.right);
        }
    }

    boolean check(Node root, int min, int max) {
        if (root != null) {
            if (root.data >= max || root.data <= min) {
                return false;
            } else {
                return check(root.left, min, root.data) && check(root.right, root.data, max);
            }
        } else {
            return true;
        }
    }

    boolean checkBST(Node root) {
        return check(root, 0, Integer.MAX_VALUE);
    }

    //todo napisać to samemu + napisać np inorder iteracyjnie, wysokość itp.

    //10 5 17 1 8 12 20 1 8 12 20
    public void levelOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        Deque<Node> queue = new ArrayDeque<>();
        //add root
        queue.add(root);
        while (!queue.isEmpty()) {
            //get first element from queue
            Node current = queue.poll();
            //print first element of queue
            System.out.print(current.getKey() + " ");
            if (current.getLeft() != null) {
                //add left to end of queue
                queue.add(current.getLeft());
            }
            if (current.getRight() != null) {
                //add right to end of queue
                queue.add(current.getRight());
            }
        }
    }

    private int findHeight(Node node) {
        if (node == null) {
            return -1;
        }

        return 1 + Math.max(findHeight(node.getLeft()), findHeight(node.getRight()));
    }

    @Override
    public String toString() {
        return "Binarytree{" +
                "root=" + root +
                '}';
    }
}
