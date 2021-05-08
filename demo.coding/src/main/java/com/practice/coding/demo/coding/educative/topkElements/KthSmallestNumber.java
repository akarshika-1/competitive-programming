package com.practice.coding.demo.coding.educative.topkElements;

import java.util.PriorityQueue;

public class KthSmallestNumber {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public int kthSmallestNumber(int[] a, int k){
        for(int i=0;i<a.length;i++){
            minHeap.offer(a[i]);
        }

        int j=0;
        while(j<k-1){
            minHeap.poll();
            j++;
        }

        return minHeap.peek();
    }

    public static void main(String[] args){
        KthSmallestNumber kthSmallestNumber1 = new KthSmallestNumber();
        System.out.println(kthSmallestNumber1.kthSmallestNumber(new int[]{1, 5, 12, 2, 11, 5}, 3));
        KthSmallestNumber kthSmallestNumber2 = new KthSmallestNumber();
        System.out.println(kthSmallestNumber2.kthSmallestNumber(new int[]{1, 5, 12, 2, 11, 5}, 4));
        KthSmallestNumber kthSmallestNumber3 = new KthSmallestNumber();
        System.out.println(kthSmallestNumber3.kthSmallestNumber(new int[]{5, 12, 11, -1, 12}, 3));
    }
}
