package com.practice.coding.demo.coding.educative.slidingWindow;

public class SmallestSubArr {

    public static int lengthSubArr(int[] a, int k){
        int st = 0;
        int ws = 0;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<a.length ; i++){
            ws += a[i];
            while(ws>=k){
               min = Math.min(min, i+1-st);
               ws-=a[st];
               st++;
            }
        }
        return  min == Integer.MAX_VALUE? 0 : min;
    }

    public static void main(String args[]){
        int[] a = new int[]{2, 1, 5, 2, 3, 2};
        System.out.println(lengthSubArr(a,7));
    }
}
