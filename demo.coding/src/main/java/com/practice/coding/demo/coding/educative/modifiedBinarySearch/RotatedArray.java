package com.practice.coding.demo.coding.educative.modifiedBinarySearch;

public class RotatedArray {

    public static int findKey(int[] a, int key){
        int start = 0;
        int end = a.length-1;
        while (start<=end){
            int mid = start +(end-start)/2;
            if(key==a[mid]){
                return mid;
            }
            if(a[start]<=a[mid]){
                if(key>=a[start] && key<a[mid]){
                    end = mid-1;
                }else{
                    start= mid+1;
                }
            }else{
                if(key>a[mid] && key<=a[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(findKey(new int[]{10, 15, 1, 3, 8}, 15));
        System.out.println(findKey(new int[]{4,5,7,9,10,-1,2}, 10));
    }
}
