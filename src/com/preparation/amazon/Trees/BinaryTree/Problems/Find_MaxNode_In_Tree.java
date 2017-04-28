package com.preparation.amazon.Trees.BinaryTree.Problems;

import com.preparation.amazon.Trees.BinaryTree.BinaryTreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by dhananjay on 29/04/17.
 */
public class Find_MaxNode_In_Tree {

    public static BinaryTreeNode findMax(BinaryTreeNode root){
        Integer maximum = Integer.MIN_VALUE;
        BinaryTreeNode maxNode = null;
        Queue<BinaryTreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (! queue.isEmpty()){
            BinaryTreeNode temp = queue.poll();
            if (temp.getData() > maximum){
                maximum = temp.getData();
                maxNode = temp;
            }

            if (temp.getLeftNode()!= null){
                queue.offer(temp.getLeftNode());
            }

            if (temp.getRightNode()!= null){
                queue.offer(temp.getRightNode());
            }
        }

        return maxNode;
    }
}
