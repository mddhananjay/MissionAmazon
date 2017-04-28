package com.preparation.amazon;

import com.preparation.amazon.Trees.BinaryTree.BinaryTreeNode;
import com.preparation.amazon.Trees.BinaryTree.CreateTree;
import com.preparation.amazon.Trees.BinaryTree.Traversals.InOrderRecursive;
import com.preparation.amazon.Trees.BinaryTree.Traversals.PostOrderRecursive;
import com.preparation.amazon.Trees.BinaryTree.Traversals.PreOrderRecursive;

public class Main {


    public static void main(String[] args) {
        BinaryTreeNode root;
        System.out.println("Hey Buddy, Now begins the serious Preparation.");
        CreateTree createTree = new CreateTree();
        root = createTree.getRoot();
        PreOrderRecursive preOrderRecursive = new PreOrderRecursive(root);

        System.out.println("\n\n\n");
        PostOrderRecursive postOrderRecursive = new PostOrderRecursive(root);

        System.out.println("\n\n\n");
        InOrderRecursive inOrderRecursive = new InOrderRecursive(root);
    }
}
