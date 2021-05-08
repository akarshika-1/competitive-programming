package com.practice.coding.demo.coding.educative.twoPointer;

import java.util.Arrays;

public class TargetSum {

    public static int[] targetSum(int[] a, int t){
        int l=0;
        int r = a.length-1;
        while(l<r){
            if(a[l]+a[r]>t){
                r--;
            }else if(a[l]+a[r]<t){
                l++;
            }else if(a[l]+a[r]==t){
                return new int[]{l, r};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String args[]){
        int[] a = new int[]{1, 2, 3, 4, 6};
        System.out.println(Arrays.toString(targetSum(a,6)));
    }
}
