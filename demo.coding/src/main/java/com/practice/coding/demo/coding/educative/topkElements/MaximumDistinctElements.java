package com.practice.coding.demo.coding.educative.topkElements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MaximumDistinctElements {

    public static int find(int[] arr, int k){
        int count = 0;
        if(arr.length<=k){
            return count;
        }
        Map<Integer, Integer> numFrequencyCount = new HashMap<>();
        for(int a: arr ){
            numFrequencyCount.put(a, numFrequencyCount.getOrDefault(a, 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((e1, e2)-> e1.getValue()- e2.getValue());

        for(Map.Entry<Integer, Integer> entry : numFrequencyCount.entrySet()){
            if(entry.getValue()==1){
                count++;
            }else{
                minHeap.add(entry);
            }
        }

        while(k>0 && !minHeap.isEmpty()){
            Map.Entry<Integer, Integer> e = minHeap.poll();
            k = k-(e.getValue()-1);
            if(k>=0){
                count++;
            }
        }

        if(k>0){
            count = count - k;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[]{7, 3, 5, 8, 5, 3, 3}, 2));
        System.out.println(find(new int[]{3, 5, 12, 11, 12}, 3));
        System.out.println(find(new int[]{1, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5}, 2));
    }
}
