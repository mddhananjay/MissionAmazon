package com.preparation.amazon.Trees.BinaryTree.Traversals;

import com.preparation.amazon.Trees.BinaryTree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by dhananjay on 29/04/17.
 */
public class BreadthFirstTraversal {

    BinaryTreeNode root;

    public BreadthFirstTraversal(BinaryTreeNode rootNode) {
        this.root = rootNode;
        iterate(root);
    }

    private void iterate(BinaryTreeNode root){
        Queue<BinaryTreeNode> binaryTreeNodeQueue = new LinkedList<>();
        binaryTreeNodeQueue.offer(root);

        while (! binaryTreeNodeQueue.isEmpty()){
            BinaryTreeNode temp = binaryTreeNodeQueue.poll();
            System.out.print("  "+temp.getData());
            if (temp.getLeftNode()!= null){
                binaryTreeNodeQueue.offer(temp.getLeftNode());
            }

            if (temp.getRightNode()!= null){
                binaryTreeNodeQueue.offer(temp.getRightNode());
            }
        }
    }



}
