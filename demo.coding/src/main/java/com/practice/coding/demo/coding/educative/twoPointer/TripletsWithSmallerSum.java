package com.practice.coding.demo.coding.educative.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletsWithSmallerSum {
    public static List<List<Integer>> findTriplets(int[] a, int targetSum){
        if(a==null || a.length<2){
            throw new IllegalArgumentException();
        }
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(a);
        for(int i=0; i<a.length-2; i++){
            int left = i+1;
            int right = a.length-1;
            while(left<right){
                if(targetSum>a[i]+a[left]+a[right]){
                    for(int j=right;j>left;j--){
                        result.add(Arrays.asList(a[i],a[left],a[j]));
                    }
                    left++;
                }else{
                    right--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(findTriplets(new int[]{-1, 0, 2, 3}, 3));
        System.out.println(findTriplets(new int[]{-1, 4, 2, 1, 3}, 5));

    }
}
