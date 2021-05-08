package com.practice.coding.demo.coding.educative.dfs;

public class TreeDiameter {
    static int diameter = 0;
    public static int getDiameter(TreeNode root){
         findDiameter(root);
         return diameter;
    }


    public static int findDiameter(TreeNode root){
        if(root==null){
            return 0;
        }

        int leftPath = findDiameter(root.left);
        int rightPath = findDiameter(root.right);

        int d = leftPath + rightPath + 1;
        diameter = Math.max(d, diameter);

        return Math.max(leftPath, rightPath)+1;
    }

    public static void main(String[] args){
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);
        root1.left.left = new TreeNode(4);
        root1.right.left = new TreeNode(5);
        root1.right.right = new TreeNode(6);
        System.out.println(getDiameter(root1));

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);
        root2.right.left = new TreeNode(5);
        root2.right.right = new TreeNode(6);
        root2.right.left.left = new TreeNode(7);
        root2.right.left.right = new TreeNode(8);
        root2.right.left.right.left = new TreeNode(10);
        root2.right.right.left = new TreeNode(9);
        root2.right.right.left.left = new TreeNode(11);
        System.out.println(getDiameter(root2));

    }
}
