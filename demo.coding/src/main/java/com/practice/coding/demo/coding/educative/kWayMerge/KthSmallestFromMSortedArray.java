package com.practice.coding.demo.coding.educative.kWayMerge;

import java.util.List;
import java.util.PriorityQueue;

public class KthSmallestFromMSortedArray {

    public static int findKthSmallest(List<List<Integer>> arraysList){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(List<Integer> array : arraysList){
            minHeap.add(array.get(0));
        }
        return 0;
    }



    public static void main(String[] args){

    }
}
