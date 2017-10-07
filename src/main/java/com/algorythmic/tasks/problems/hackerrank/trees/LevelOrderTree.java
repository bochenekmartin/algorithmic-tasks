package com.algorythmic.tasks.problems.hackerrank.trees;

import com.algorythmic.tasks.model.BinaryTree;
import com.algorythmic.tasks.model.Node;
import com.algorythmic.tasks.problems.hackerrank.trees.utils.ExampleTree;

import java.util.Deque;
import java.util.LinkedList;

public class LevelOrderTree {

    public static void main(String[] args) {
        BinaryTree exampleTree = ExampleTree.createExampleTree();

        new LevelOrderTree().levelOrder(exampleTree.getRoot());
    }


    /*

 class Node
    int data;
    Node left;
    Node right;
*/
    void levelOrder(Node root) {
        if (root == null) {
            return;
        }
        Deque<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.print(Integer.toString(node.data()) + ' ');
            addIfNotNull(queue, node.left);
            addIfNotNull(queue, node.right);
        }
    }

    private void addIfNotNull(Deque<Node> queue, Node node) {
        if (node != null) {
            queue.addLast(node);
        }
    }
}
