package com.practice.coding.demo.coding.educative.topkElements;

import java.util.*;

class Entry{
    int key;
    int val;

    public Entry(int key, int val) {
        this.key = key;
        this.val = val;
    }
}

public class KClosestNumbers {

    public static int[] kClosestNumbers(int[] a, int k, int x){
       int index = binarySearch(a, x);
       int low = index - k;
       int high = index + k;
       low = Math.max(low, 0);
       high = Math.min(high, a.length-1);

       PriorityQueue<Entry> minheap = new PriorityQueue<>((e1,e2)->e1.key-e2.key);
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =low; i<=high; i++){
            minheap.add(new Entry(Math.abs(a[i]-x), i));
        }

        int[] result = new int[k];
        for(int i=0; i<k; i++){
            result[i] = a[minheap.poll().val];
        }
        Arrays.sort(result);
        return result;

    }

    public static int binarySearch(int[] a, int x){
        int low = 0;
        int high = a.length-1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(a[mid]==x){
                return mid;
            }else if(a[mid]<x){
                low = mid + 1;
            }else{
               high = mid - 1;
            }
        }
        if(low>0){
            return low-1;
        }
        return low;
    }



    public static void main(String[] args){
        System.out.println(Arrays.toString(kClosestNumbers(new int[]{5, 6, 7, 8, 9}, 3, 7)));
        System.out.println(Arrays.toString(kClosestNumbers(new int[]{2, 4, 5, 6, 9}, 3, 6)));
        System.out.println(Arrays.toString(kClosestNumbers(new int[]{2, 4, 5, 6, 9}, 3, 10)));
    }
}
