package com.preparation.amazon.Trees.BinaryTree;

/**
 * Created by dhananjay on 28/04/17.
 */
public class CreateTree {

    public CreateTree() {

        /*
                      |--7___8
               |-- 3--|      __ 11
               |      |--6---|__ 10
        1 -----|
               |      |--5_9
               |-- 2--|
                      |--4
        */

        BinaryTreeNode eight = new BinaryTreeNode(8);
        BinaryTreeNode nine = new BinaryTreeNode(9);
        BinaryTreeNode ten = new BinaryTreeNode(10);
        BinaryTreeNode _one = new BinaryTreeNode(11);
        BinaryTreeNode six = new BinaryTreeNode(ten,_one,6);
        BinaryTreeNode seven = new BinaryTreeNode(null,eight,7);
        BinaryTreeNode four = new BinaryTreeNode(4);
        BinaryTreeNode five = new BinaryTreeNode(nine,null,5);
        BinaryTreeNode three = new BinaryTreeNode(six,seven,3);
        BinaryTreeNode two = new BinaryTreeNode(four,five,2);
        BinaryTreeNode one = new BinaryTreeNode(two,three,1);
    }



    // one = root



}
