package com.preparation.amazon.Trees.BinaryTree;

/**
 * Created by dhananjay on 28/04/17.
 */
public class CreateTree {

    BinaryTreeNode eight;
    BinaryTreeNode nine ;
    BinaryTreeNode ten  ;
    BinaryTreeNode _one ;
    BinaryTreeNode six  ;
    BinaryTreeNode seven;
    BinaryTreeNode four ;
    BinaryTreeNode five ;
    BinaryTreeNode three;
    BinaryTreeNode two  ;
    BinaryTreeNode one  ;

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

       eight = new BinaryTreeNode(8);
       nine  = new BinaryTreeNode(9);
       ten   = new BinaryTreeNode(10);
       _one  = new BinaryTreeNode(11);
       six   = new BinaryTreeNode(ten,_one,6);
       seven = new BinaryTreeNode(null,eight,7);
       four  = new BinaryTreeNode(4);
       five  = new BinaryTreeNode(nine,null,5);
       three = new BinaryTreeNode(six,seven,3);
       two   = new BinaryTreeNode(four,five,2);
       one   = new BinaryTreeNode(two,three,1);
    }

    public BinaryTreeNode getRoot(){
        return one;
    }
}
