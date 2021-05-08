package com.practice.coding.demo.coding.educative.twoPointer;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;
import java.util.List;

public class ProductLessThanTarget {

    public static List<List<Integer>> findSubArray(int[] a, int target){
        int product = 1;
        int left = 0;
        List<List<Integer>> result = new ArrayList<>();
        for(int right=0; right<a.length; right++){
            product*=a[right];
            while(product>=target && left<a.length){
                product/=a[left++];
            }
            List<Integer> temp = new ArrayList<>();
            for(int i=right;i>=left;i--){
                temp.add(0,a[i]);
                result.add(new ArrayList<>(temp));
            }
        }
        return result;
    }

    public static void main(String args[]){
        System.out.println(findSubArray(new int[]{2,5,3,10}, 30));
        System.out.println(findSubArray(new int[]{8,2,6,5}, 50));

    }
}
