package com.practice.coding.demo.coding.educative.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagLevel {

    public static List<List<Integer>> zigzagLevelTraversal(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        boolean leftToRight = true;
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> currLevel = new ArrayList<>();
            for(int i=0;i<levelSize;i++){
                TreeNode currNode = queue.poll();
                if(leftToRight){
                    currLevel.add(currNode.val);
                }else{
                    currLevel.add(0,currNode.val);
                }
                if(currNode.left != null){
                    queue.offer(currNode.left);
                }
                if(currNode.right != null){
                    queue.offer(currNode.right);
                }
            }
            result.add(currLevel);
            leftToRight = !leftToRight;

        }
        return result;
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
        System.out.println(zigzagLevelTraversal(head));

    }
}
