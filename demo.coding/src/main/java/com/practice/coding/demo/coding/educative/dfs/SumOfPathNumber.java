package com.practice.coding.demo.coding.educative.dfs;

import java.util.ArrayList;
import java.util.List;

public class SumOfPathNumber {

    public static int sumOfPathNumbers(TreeNode root, int pathSum){
        if(root==null)
            return 0;

        pathSum = pathSum*10+ root.val;

        if(root.left==null && root.right==null) {
            return pathSum;
        }

        return sumOfPathNumbers(root.left, pathSum)+
                sumOfPathNumbers(root.right, pathSum);
    }

    public static void main(String[] args){
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(7);
        root1.right = new TreeNode(9);
        root1.right.left = new TreeNode(2);
        root1.right.right = new TreeNode(9);
        System.out.println(sumOfPathNumbers(root1, 0));

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(0);
        root2.right = new TreeNode(1);
        root2.left.left = new TreeNode(1);
        root2.right.left = new TreeNode(6);
        root2.right.right = new TreeNode(5);
        System.out.println(sumOfPathNumbers(root2, 0));
    }
}
