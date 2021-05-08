package com.practice.coding.demo.coding.educative.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectAllLevelOrderSiblings {

    public static void connectAllLevelOrder(TreeNode root){
        if(root==null){
            return;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        TreeNode prev = null;
        TreeNode curr = null;
        while (!q.isEmpty()){
            int levelSize = q.size();
            for(int i=0; i<levelSize; i++){
                curr = q.poll();
                if(prev != null){
                    prev.next = curr;
                }
                prev = curr;

                if(curr.left!=null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
        }
    }

    public static void printLevelOrder(TreeNode root){
        TreeNode curr = root;
        while (curr!=null){
            System.out.print(curr.val +" ");
                curr = curr.next;
        }
    }



    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(5);
        head.right.left = new TreeNode(6);
        head.right.right = new TreeNode(7);
        head.left.left.left = new TreeNode(8);
        head.left.right.right = new TreeNode(9);
        head.right.left.left = new TreeNode(10);
        head.right.right.right = new TreeNode(11);
        connectAllLevelOrder(head);
        printLevelOrder(head);

    }
}
