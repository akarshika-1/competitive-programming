package com.practice.coding.demo.coding.educative.modifiedBinarySearch;

public class RotationCount {

    public static int findRotatedCount(int[] a){
        int start =0;
        int end = a.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(mid>start && a[mid-1]>a[mid]){
                return mid;
            }else if(mid<end && a[mid]>a[mid+1]){
                return mid+1;
            }
            if(a[start]<a[mid]){
                start = mid+1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        System.out.println(findRotatedCount(new int[]{10,15,1,3,8}));
        System.out.println(findRotatedCount(new int[]{4,5,7,9,10,-1,2}));
    }
}
