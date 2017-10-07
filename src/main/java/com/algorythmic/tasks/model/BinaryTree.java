package com.algorythmic.tasks.model;

import com.google.common.base.MoreObjects;

public class BinaryTree {

    private Node root;

    public BinaryTree(int data) {
        root = new Node(data);
    }

    public void addLeft(Node parent, Node child) {
        parent.setLeft(child);
    }

    public void addRight(Node parent, Node child) {
        parent.setLeft(child);
    }

    public Node getRoot() {
        return root;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("root", root)
                .toString();
    }
}
