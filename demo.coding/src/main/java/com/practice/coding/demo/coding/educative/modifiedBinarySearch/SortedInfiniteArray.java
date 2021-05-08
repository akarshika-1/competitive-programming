package com.practice.coding.demo.coding.educative.modifiedBinarySearch;


public class SortedInfiniteArray {

    public static int findIndex(ArrayReader ar, int key){
        int start=0;
        int end = 1;
        while(ar.get(end)<key){
            int newStart = end +1;
            end = end + (end - start+1)*2;
            start = newStart;
        }
        return binarySearch(ar, key, start, end);
    }

    public static int binarySearch(ArrayReader ar, int key, int start, int end){
        while(start<=end){
            int mid = start + (end-start)/2;
            if(key>ar.get(mid)){
                start = mid +1;
            }else if(key<ar.get(mid)){
                end = mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        System.out.println(findIndex(new ArrayReader(new int[]{4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30}), 16));
        System.out.println(findIndex(new ArrayReader(new int[]{4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30}), 11));
        System.out.println(findIndex(new ArrayReader(new int[]{1, 3, 8, 10, 15}), 15));
        System.out.println(findIndex(new ArrayReader(new int[]{1, 3, 8, 10, 15}), 200));

    }
}



