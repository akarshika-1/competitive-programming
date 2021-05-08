package com.practice.coding.demo.coding.educative.modifiedBinarySearch;

public class CeilingOfANumber {

    public static int findCeiling(int[] a, int key){
        if(key>a[a.length-1]){
            return -1;
        }
        int start = 0;
        int end = a.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(key>a[mid]){
                start = mid+1;
            }else if(key<a[mid]){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return start;
    }

    public static void main(String[] args){
        System.out.println(findCeiling(new int[]{4,6,10}, 6));
        System.out.println(findCeiling(new int[]{1,3,8,10,15}, 12));
        System.out.println(findCeiling(new int[]{4,6,10}, 17));

    }
}
