package com.practice.coding.demo.coding.educative.dfs;

import java.util.ArrayList;
import java.util.List;

public class AllPathSum {

    public static void allPathSum(TreeNode currentNode, int sum, List<List<Integer>> allPaths,List<Integer> currentPath){
        if(currentNode==null){
            return;
        }
        currentPath.add(currentNode.val);

        if(currentNode.val == sum && currentNode.left == null && currentNode.right == null){
            allPaths.add(new ArrayList<>(currentPath));
        }else{
            allPathSum(currentNode.left, sum-currentNode.val, allPaths, currentPath);
            allPathSum(currentNode.right, sum-currentNode.val, allPaths, currentPath);
        }
        currentPath.remove(currentPath.size() - 1);


    }

    public static void main(String[] args){
        TreeNode head = new TreeNode(12);
        head.left = new TreeNode(7);
        head.right = new TreeNode(1);
        head.left.left = new TreeNode(4);
        head.right.left = new TreeNode(10);
        head.right.right = new TreeNode(5);
        List<List<Integer>> allPaths = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        allPathSum(head, 23, allPaths, currentPath);
        System.out.println(allPaths);

    }
}
