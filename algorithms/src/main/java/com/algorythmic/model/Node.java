package com.algorythmic.model;

import com.google.common.base.MoreObjects;

public class Node {

    public int data;
    public Node left;
    public Node right;

    public Node(int key) {
        data = key;
        right = null;
        left = null;
    }

    public void setKey(int key) {
        data = key;
    }

    public int getKey() {
        return data;
    }

    public int getData() {
        return data;
    }

    public int data() {
        return data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getLeft() {
        return left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getRight() {
        return right;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("data", data)
                .add("left", left)
                .add("right", right)
                .toString();
    }
}

