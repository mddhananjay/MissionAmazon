package com.preparation.amazon;

import com.preparation.amazon.Trees.BinaryTree.BinaryTreeNode;
import com.preparation.amazon.Trees.BinaryTree.CreateTree;
import com.preparation.amazon.Trees.BinaryTree.Problems.DepthOfBinaryTree;
import com.preparation.amazon.Trees.BinaryTree.Problems.Find_MaxNode_In_Tree;
import com.preparation.amazon.Trees.BinaryTree.Problems.ReverseLevelOrder;
import com.preparation.amazon.Trees.BinaryTree.Traversals.BreadthFirstTraversal;
import com.preparation.amazon.Trees.BinaryTree.Traversals.InOrderRecursive;
import com.preparation.amazon.Trees.BinaryTree.Traversals.PostOrderRecursive;
import com.preparation.amazon.Trees.BinaryTree.Traversals.PreOrderRecursive;

public class Main {


    public static void main(String[] args) {
        BinaryTreeNode root;
        CreateTree createTree = new CreateTree();
        root = createTree.getRoot();

      /*  PreOrderRecursive preOrderRecursive = new PreOrderRecursive(root);

        System.out.println("\n\n\n");
        PostOrderRecursive postOrderRecursive = new PostOrderRecursive(root);

        System.out.println("\n\n\n");
        InOrderRecursive inOrderRecursive = new InOrderRecursive(root);

        System.out.println("\n\n\n");

        BreadthFirstTraversal breadthFirstTraversal = new BreadthFirstTraversal(root);
        System.out.println("\n\n");
        ReverseLevelOrder.printReverseLevelOrder(root);*/

        System.out.println("\n  Maximum node in tree is "+Find_MaxNode_In_Tree.findMax(root).getData());
        System.out.println("\n  Depth of this tree is "+ DepthOfBinaryTree.depthOfBinaryTree(root));

    }
}
