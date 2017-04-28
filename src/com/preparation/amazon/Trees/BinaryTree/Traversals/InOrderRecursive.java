package com.preparation.amazon.Trees.BinaryTree.Traversals;

import com.preparation.amazon.Trees.BinaryTree.BinaryTreeNode;

/**
 * Created by dhananjay on 28/04/17.
 */
public class InOrderRecursive {


    BinaryTreeNode root;
    public InOrderRecursive(BinaryTreeNode rootNode) {
        this.root = rootNode;
        InOrderRecursive(root);
    }

    private void InOrderRecursive(BinaryTreeNode root){
        if (null != root){
            InOrderRecursive(root.getLeftNode());
            System.out.print("  "+root.getData());
            InOrderRecursive(root.getRightNode());
        }
    }
}
