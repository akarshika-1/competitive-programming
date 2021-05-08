package com.practice.coding.demo.coding.geeksforgeeks.hashing;

import java.util.Arrays;
import java.util.HashSet;

public class CheckPairSum {

    public static int[] findPair(int[] a, int Sum){
        int[] result = new int[]{};
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i=0; i<a.length; i++){
            int temp = Sum - a[i];
            if(hashSet.contains(temp)){
                result = new int[]{a[i],temp};
            }
            hashSet.add(a[i]);
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(findPair(new int[]{0,-1,2,-3,1}, -2)));
    }
}
