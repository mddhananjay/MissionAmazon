package com.preparation.amazon.Trees.BinaryTree.Traversals;

import com.preparation.amazon.Trees.BinaryTree.BinaryTreeNode;

/**
 * Created by dhananjay on 28/04/17.
 */
public class PreOrderRecursive {
    BinaryTreeNode root;
    public PreOrderRecursive(BinaryTreeNode rootNode) {
        this.root = rootNode;
        preOrder(root);
    }

    private void preOrder(BinaryTreeNode root){
        if (root!= null){
            System.out.println(root.getData());
            preOrder(root.getLeftNode());
            preOrder(root.getRightNode());
        }

    }
}
