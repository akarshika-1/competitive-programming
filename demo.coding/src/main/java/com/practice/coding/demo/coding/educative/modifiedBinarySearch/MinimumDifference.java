package com.practice.coding.demo.coding.educative.modifiedBinarySearch;

public class MinimumDifference {

    public static int minimumDifference(int[] a, int key){
        if(key<a[0]){
            return a[0];
        }
        if(key>a[a.length-1]){
            return a[a.length-1];
        }
        int start = 0;
        int end = a.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(key>a[mid]){
                start= mid+1;
            }else if(key<a[mid]){
                end = mid - 1;
            }else{
                return a[mid];
            }
        }
        if((a[start]-key)<(key-a[end])){
            return a[start];
        }else{
            return a[end];
        }
    }

    public static void main(String[] args){
        System.out.println(minimumDifference(new int[]{4, 6, 10}, 7));
        System.out.println(minimumDifference(new int[]{4, 6, 10}, 4));
        System.out.println(minimumDifference(new int[]{1, 3, 8, 10, 15}, 12));
        System.out.println(minimumDifference(new int[]{4, 6, 10}, 17));
    }
}
