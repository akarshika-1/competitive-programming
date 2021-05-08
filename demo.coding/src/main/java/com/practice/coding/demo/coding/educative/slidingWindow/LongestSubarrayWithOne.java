package com.practice.coding.demo.coding.educative.slidingWindow;

public class LongestSubarrayWithOne {
    public static int findLongestSubArrayWithOne(int[] a, int k){
        int ws=0, maxLength = 0, maxOnes = 0;
        for(int i=0;i<a.length; i++){
            if(a[i]==1){
                maxOnes++;
            }
            if(i-ws+1-maxOnes>k){
                if(a[ws]==1){
                    maxOnes--;
                }
                ws++;
            }
            maxLength = Math.max(maxLength, i-ws+1);
        }
        return maxLength;
    }

    public static void main(String[] args){
        int[] a = new int[]{0,1,0,0,1,1,0,1,1,0,0,1,1};
        System.out.println(findLongestSubArrayWithOne(a,3));
        System.out.println(findLongestSubArrayWithOne(new int[]{0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1},2));

    }
}
