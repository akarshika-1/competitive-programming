package com.practice.coding.demo.coding.educative.dfs;

import java.util.ArrayList;
import java.util.List;

public class CountPathsForASum {
    static List<Integer> list = new ArrayList<>();

    public static int findCountPaths(TreeNode root, int sum) {
        return findCount(root, sum);
    }

    public static int findCount(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }

        list.add(root.val);

        int temp = 0;
        int count = 0;

        for (int i = list.size() - 1; i >= 0; i--) {
            temp += list.get(i);
            if (temp == sum) {
                count++;
            }
        }

        count += findCount(root.left, sum);
        count += findCount(root.right, sum);
        list.remove(list.size()-1);
        return count;
    }


    public static void main(String[] args){
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(7);
        root1.right = new TreeNode(9);
        root1.left.left = new TreeNode(6);
        root1.left.right = new TreeNode(5);
        root1.right.left = new TreeNode(2);
        root1.right.right = new TreeNode(3);
        System.out.println(findCountPaths(root1, 12));

        TreeNode root2 = new TreeNode(12);
        root2.left = new TreeNode(7);
        root2.right = new TreeNode(1);
        root2.left.left = new TreeNode(4);
        root2.right.left = new TreeNode(10);
        root2.right.right = new TreeNode(5);
        System.out.println(findCountPaths(root2, 11));

    }
}
