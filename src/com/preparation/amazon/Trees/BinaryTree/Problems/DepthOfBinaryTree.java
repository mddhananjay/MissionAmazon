package com.preparation.amazon.Trees.BinaryTree.Problems;

import com.preparation.amazon.Trees.BinaryTree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by dhananjay on 29/04/17.
 */
public class DepthOfBinaryTree {

    public static int depthOfBinaryTree(BinaryTreeNode root) {
        int height = 0;
        Queue<BinaryTreeNode> binaryTreeNodeQueue = new LinkedList<>();
        Stack<BinaryTreeNode> stack = new Stack<>();
        binaryTreeNodeQueue.offer(root);
        binaryTreeNodeQueue.offer(null);
        while (!binaryTreeNodeQueue.isEmpty()) {
            BinaryTreeNode temp = binaryTreeNodeQueue.poll();
            if (temp == null) {
                height = height + 1;
                if (!binaryTreeNodeQueue.isEmpty())
                    binaryTreeNodeQueue.offer(null);
            } else {
                if (temp.getRightNode() != null) {
                    binaryTreeNodeQueue.offer(temp.getRightNode());
                }
                if (temp.getLeftNode() != null) {
                    binaryTreeNodeQueue.offer(temp.getLeftNode());
                }
            }

        }

        return height;
    }
}
