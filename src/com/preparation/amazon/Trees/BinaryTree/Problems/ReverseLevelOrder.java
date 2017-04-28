package com.preparation.amazon.Trees.BinaryTree.Problems;

import com.preparation.amazon.Trees.BinaryTree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by dhananjay on 29/04/17.
 */
public class ReverseLevelOrder {

    public static void printReverseLevelOrder(BinaryTreeNode root){
        Queue<BinaryTreeNode> binaryTreeNodeQueue = new LinkedList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        binaryTreeNodeQueue.offer(root);

        while (! binaryTreeNodeQueue.isEmpty()){
            BinaryTreeNode temp = binaryTreeNodeQueue.poll();
            stack.push(temp);
            if (temp.getRightNode()!= null){
                binaryTreeNodeQueue.offer(temp.getRightNode());
            }
            if (temp.getLeftNode()!= null){
                binaryTreeNodeQueue.offer(temp.getLeftNode());
            }
        }

        while (!stack.isEmpty()){
            System.out.print("  "+stack.pop().getData());
        }

    }
}
