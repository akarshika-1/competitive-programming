package com.practice.coding.demo.coding.educative.dfs;

public class PathWithGivenSequence {

    public static boolean sequencePresent(TreeNode currentNode, int[] s, int sequenceIndex){
        if(currentNode==null)
            return false;


        if(sequenceIndex>=s.length || currentNode.val!=s[sequenceIndex]){
            return false;
        }

        if(currentNode.left==null && currentNode.right == null && sequenceIndex==s.length-1){
            return true;
        }
        return sequencePresent(currentNode.left, s, sequenceIndex+1)||
                sequencePresent(currentNode.right, s, sequenceIndex+1);
    }

    public static void main(String[] args){
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(7);
        root1.right = new TreeNode(9);
        root1.right.left = new TreeNode(2);
        root1.right.right = new TreeNode(9);
        System.out.println(sequencePresent(root1, new int[]{1,9,9}, 0));

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(0);
        root2.right = new TreeNode(1);
        root2.left.left = new TreeNode(1);
        root2.right.left = new TreeNode(6);
        root2.right.right = new TreeNode(5);
        System.out.println(sequencePresent(root2, new int[]{1,0,7}, 0));
        System.out.println(sequencePresent(root2, new int[]{1,1,6}, 0));

    }
}
