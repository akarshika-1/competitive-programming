package com.practice.coding.demo.coding.geeksforgeeks.hashing;

import java.util.HashMap;

public class SubArraySumZero {

    public static int subArraySum(int[] a){
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
        int sum = 0;
        int maxLength = 0;
        for(int i=0;i<a.length;i++){
            sum +=a[i];
            if(a[i]==0&&maxLength==0){
                maxLength = 1;
            }
            if(sum==0){
                maxLength = i+1;
            }

            Integer prevIndex = sumIndexMap.get(sum);

            if(prevIndex!=null){
                maxLength = Math.max(maxLength, i-prevIndex);
            }else{
                sumIndexMap.put(sum, i);
            }
        }
        return maxLength;
    }

    public static void main(String[] args){
        System.out.println(subArraySum(new int[]{15,-2,2,-8,1,7,10}));
        System.out.println(subArraySum(new int[]{15,-2,2,-8,1,-8,10}));
    }
}
