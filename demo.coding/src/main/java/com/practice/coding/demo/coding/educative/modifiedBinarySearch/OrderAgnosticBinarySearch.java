package com.practice.coding.demo.coding.educative.modifiedBinarySearch;

public class OrderAgnosticBinarySearch {

    public static int binarySearch(int[] a, int key, int start, int end){
        int mid = start + (end-start)/2;
        if(key==a[mid]){
            return mid;
        }else if(key>a[mid]){
            return binarySearch(a,key,mid+1,end);
        }else{
            return binarySearch(a, key, start, mid-1);
        }
    }

    public static void main(String[] args){
        int a1[] = new int[]{4, 6, 10};
        System.out.println(binarySearch(a1, 10, 0, a1.length-1));
        int a2[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        System.out.println(binarySearch(a2, 5, 0, a2.length-1));

    }
}
