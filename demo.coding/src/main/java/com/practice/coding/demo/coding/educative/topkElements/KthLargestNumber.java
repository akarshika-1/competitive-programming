package com.practice.coding.demo.coding.educative.topkElements;

import java.util.PriorityQueue;

public class KthLargestNumber {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public KthLargestNumber(int[] a, int k) {
        for(int i=0;i<a.length;i++){
            minHeap.offer(a[i]);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }
    }

    private int add(int num) {
        if(num > minHeap.peek()){
            minHeap.poll();
            minHeap.add(num);
        }
        return minHeap.peek();
    }
    public static void main(String[] args){
        KthLargestNumber minHeap = new KthLargestNumber(new int[]{3, 1, 5, 12, 2, 11}, 4);
        System.out.println(minHeap.add(6));
        System.out.println(minHeap.add(13));
        System.out.println(minHeap.add(4));
    }
}
