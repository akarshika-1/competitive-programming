package com.practice.coding.demo.coding.educative.dfs;

public class PathWithMaximumSum {
    static int globalSum = Integer.MIN_VALUE;
    public static int pathWithMaxSum(TreeNode root){
        findMaxSum(root);
        return globalSum;
    }

    public static int findMaxSum(TreeNode root){
        if(root==null){
            return 0;
        }

        int leftSum = findMaxSum(root.left);
        int rightSum = findMaxSum(root.right);

        leftSum = Math.max(leftSum, 0);
        rightSum = Math.max(rightSum, 0);

        int localSum = leftSum+rightSum+root.val;

        globalSum = Math.max(globalSum, localSum);

        return Math.max(leftSum, rightSum) + root.val;
    }

    public static void main(String[] args){
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.right.left = new TreeNode(5);
        root1.right.right = new TreeNode(6);
        System.out.println(pathWithMaxSum(root1));

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.left.left = new TreeNode(1);
        root2.left.right = new TreeNode(3);
        root2.right.left = new TreeNode(5);
        root2.right.left.left = new TreeNode(7);
        root2.right.left.right = new TreeNode(8);
        root2.right.right = new TreeNode(6);
        root2.right.right.left = new TreeNode(9);
        System.out.println(pathWithMaxSum(root2));

    }
}
