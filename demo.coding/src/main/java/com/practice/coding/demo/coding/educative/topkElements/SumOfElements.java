package com.practice.coding.demo.coding.educative.topkElements;

import java.util.PriorityQueue;

public class SumOfElements {

    public static int findSum(int[] arr, int k1, int k2){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b)-> a-b);
        for(int a : arr){
            minHeap.add(a);
        }
        int sum = 0;
        int i=1;
        while (!minHeap.isEmpty() && i<=k1){
            minHeap.poll();
            i++;
        }
        int j =1;
        while(!minHeap.isEmpty() && j<=k2-k1-1){
            sum += minHeap.poll();
            j++;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(findSum(new int[]{1, 3, 12, 5, 15, 11}, 3, 6));
        System.out.println(findSum(new int[]{3, 5, 8, 7}, 1, 4));

    }
}
