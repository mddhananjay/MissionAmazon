package com.preparation.amazon.Trees.BinaryTree;

/**
 * Created by dhananjay on 28/04/17.
 */
public class BinaryTreeNode {

    BinaryTreeNode leftNode;
    BinaryTreeNode rightNode;
    Integer data;

    public BinaryTreeNode(Integer data) {
        this.data = data;
        this.leftNode = null;
        this.rightNode = null;
    }

    public BinaryTreeNode(BinaryTreeNode leftNode, BinaryTreeNode rightNode, Integer data) {
        this.leftNode = leftNode;
        this.rightNode = rightNode;
        this.data = data;
    }

    public BinaryTreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinaryTreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public BinaryTreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinaryTreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }
}
