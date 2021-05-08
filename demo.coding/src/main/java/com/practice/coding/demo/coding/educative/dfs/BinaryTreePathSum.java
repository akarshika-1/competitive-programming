package com.practice.coding.demo.coding.educative.dfs;

public class BinaryTreePathSum {

    public static boolean hasPathSum(TreeNode root, int sum){
        if(root == null){
            return false;
        }
        if(root.left == null && root.right == null && root.val == sum){
            return true;
        }
        return hasPathSum(root.left, sum-root.val) || hasPathSum(root.right, sum- root.val);
    }

    public static void main(String args[]){
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
        System.out.println("Tree has path with sum 23 : "+ hasPathSum(root, 23));
        System.out.println("Tree has path with sum 16 : "+ hasPathSum(root, 16));
    }
}
