package com.practice.coding.demo.coding.educative.bfs;

import java.util.LinkedList;
import java.util.Queue;

public class Depth {

    public static int findDepth(TreeNode root){
        if(root == null){
            return 0;
        }

        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            depth++;
            int levelSize = queue.size();
            for(int i = 0 ; i<levelSize; i++){
                TreeNode currentNode = queue.poll();
                if(currentNode.left == null && currentNode.right == null){
                    return depth;
                }
                if(currentNode.left!=null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }

        }
        return depth;
    }

    public static void main(String args[]){
        TreeNode t1 = new TreeNode(1);
        t1.left = new TreeNode(2);
        t1.right = new TreeNode(3);
        t1.left.left = new TreeNode(4);
        t1.left.right = new TreeNode(5);
        System.out.println("Minimum depth of t1 : "+findDepth(t1));
        System.out.println();

        TreeNode t2 = new TreeNode(1);
        t2.left = new TreeNode(2);
        t2.right = new TreeNode(3);
        t2.left.left = new TreeNode(4);
        t2.right.left = new TreeNode(6);
        t2.right.right = new TreeNode(7);
        t2.right.left.left = new TreeNode(8);
        System.out.println("Minimum depth of t2 : "+findDepth(t2));

    }
}
