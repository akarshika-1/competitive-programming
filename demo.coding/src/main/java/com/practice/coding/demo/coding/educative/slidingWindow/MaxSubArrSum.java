package com.practice.coding.demo.coding.educative.slidingWindow;

public class MaxSubArrSum {

    public static int sumSubArr(int[] a, int k){
        int max = 0;
        int ws = 0;
        int st = 0;
        for(int i=0; i<a.length; i++){
           ws += a[i];
           if(i>=k-1){
               max = Math.max(max, ws);
               ws -= a[st];
               st++;
           }
        }
        return max;
    }
    public static void main(String[] args){
        int[] a = new int[]{2, 1, 5, 1, 3, 2};
        System.out.println(sumSubArr(a, 3));

    }
}
