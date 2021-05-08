package com.practice.coding.demo.coding.educative.twoPointer;

public class MinimumWindowSort {

    public static int minimumWindowSort(int a[]){
        int left = 0;
        int right = a.length -1;
        while(left<a.length-1 && a[left]<=a[left+1]){
            left++;
        }
        if(left == right){
            return 0;
        }
        while (right>0 && a[right] >= a[right - 1]) {
            right--;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = left; i <= right; i++) {
            max = Math.max(max, a[i]);
            min = Math.min(min, a[i]);
        }

        while (left > 0 && min < a[left - 1])
            left--;

        while (right<a.length-1 && max > a[right + 1])
            right++;

        return right - left + 1;
    }

    public static void main(String[] args){
        System.out.println(minimumWindowSort(new int[]{1,2,5,3,7,10,9,12}));
        System.out.println(minimumWindowSort(new int[]{1,3,2,0,-1,7,10}));
        System.out.println(minimumWindowSort(new int[]{1,2,3}));
        System.out.println(minimumWindowSort(new int[]{3,2,1}));

    }
}
