package com.preparation.amazon.Trees.BinaryTree.Traversals;

import com.preparation.amazon.Trees.BinaryTree.BinaryTreeNode;

/**
 * Created by dhananjay on 28/04/17.
 */
public class PostOrderRecursive {

    BinaryTreeNode root;
    public PostOrderRecursive(BinaryTreeNode rootNode) {
        this.root = rootNode;
        postOrder(root);
    }

    private void postOrder(BinaryTreeNode root){
        if (null != root){
            postOrder(root.getLeftNode());
            postOrder(root.getRightNode());
            System.out.println(root.getData());
        }
    }
}
