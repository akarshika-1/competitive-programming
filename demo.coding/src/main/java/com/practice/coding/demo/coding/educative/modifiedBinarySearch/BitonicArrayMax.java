package com.practice.coding.demo.coding.educative.modifiedBinarySearch;

public class BitonicArrayMax {

    public static int findMax(int[] a){
        int start = 0;
        int end = a.length-1;
        while (start<end){
            int mid = start + (end - start)/2;
            if(a[mid]>a[mid+1]){
                end=mid;
            }else {
                start = mid +1;
            }
        }
        return a[start];
    }

    public static void main(String[] args){
        System.out.println(findMax(new int[]{1,3,8,12,4,2}));
        System.out.println(findMax(new int[]{3,8,3,1}));
        System.out.println(findMax(new int[]{1,3,8,12}));
        System.out.println(findMax(new int[]{10,9,8}));
    }
}
