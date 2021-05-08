package com.practice.coding.demo.coding.educative.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewOfTheBinaryTree {

    public static List<TreeNode> rightView(TreeNode root){
        List<TreeNode> result = new ArrayList<>();
        if(root==null){
            return  result;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            int levelSize = q.size();
            for (int i=0; i<levelSize; i++){
                TreeNode curr = q.poll();
                if(i==levelSize-1){
                    result.add(curr);
                }
                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
        }
        return result;
    }

    public  static  void printRightView(List<TreeNode> nodes){
        for(TreeNode node : nodes){
            System.out.print(node.val+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        TreeNode t1 = new TreeNode(12);
        t1.left = new TreeNode(7);
        t1.right = new TreeNode(1);
        t1.left.left = new TreeNode(9);
        t1.right.left = new TreeNode(10);
        t1.right.right = new TreeNode(5);
        t1.left.left.left = new TreeNode(3);
        printRightView(rightView(t1));

        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
        t2.right = new TreeNode(3);
        t2.left.left = new TreeNode(4);
        t2.left.right = new TreeNode(5);
        t2.right.left = new TreeNode(6);
        t2.right.right = new TreeNode(7);
        printRightView(rightView(t2));
        System.out.println();

    }
}
