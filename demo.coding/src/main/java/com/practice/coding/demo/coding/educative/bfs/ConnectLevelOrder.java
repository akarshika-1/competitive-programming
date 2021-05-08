package com.practice.coding.demo.coding.educative.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectLevelOrder {

    public static void printLevelOrder(TreeNode root){
        TreeNode nextLevelNode = root;
        while(nextLevelNode!=null){
            TreeNode current = nextLevelNode;
            nextLevelNode = null;
            while(current != null){
                System.out.print(current.val + " ");
                if(nextLevelNode == null){
                    if(current.left != null){
                        nextLevelNode = current.left;
                    }
                    else if(current.right != null){
                        nextLevelNode = current.right;
                    }
                }

                current = current.next;
            }
            System.out.println();
        }
    }

    public static void connectLevelOrder(TreeNode root){
        if(root==null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode previous = null;
            int levelSize = queue.size();
            for(int i=0;i<levelSize;i++){
                TreeNode currentNode = queue.poll();
                if(previous!=null){
                    previous.next = currentNode;
                }
                previous = currentNode;

                if(currentNode.left !=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right !=null){
                    queue.offer(currentNode.right);
                }
            }
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
        connectLevelOrder(head);
        printLevelOrder(head);

    }
}
