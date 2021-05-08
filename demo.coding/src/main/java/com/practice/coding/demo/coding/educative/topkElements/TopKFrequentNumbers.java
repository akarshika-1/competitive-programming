package com.practice.coding.demo.coding.educative.topkElements;

import java.util.*;

public class TopKFrequentNumbers {

    public static List<Integer> topKFrequentNumbers(int[] a, int k){
        Map<Integer, Integer> numFrequencyMap = new HashMap<>();
        for(int i=0;i<a.length;i++){
            numFrequencyMap.put(a[i], numFrequencyMap.getOrDefault(a[i], 0)+1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((e1,e2)->e1.getValue()-e2.getValue());

        for(Map.Entry<Integer, Integer> map : numFrequencyMap.entrySet()){
            minHeap.add(map);
            if(minHeap.size()>k){
                minHeap.poll();
            }
        }

        List<Integer> topFrequentNumbers = new ArrayList<>(k);
        while(!minHeap.isEmpty()){
            topFrequentNumbers.add(minHeap.poll().getKey());
        }

        return topFrequentNumbers;
    }

    public static void main(String[] args){
        System.out.println(topKFrequentNumbers(new int[]{1, 3, 5, 12, 11, 12, 11}, 2));
        System.out.println(topKFrequentNumbers(new int[]{5, 12, 11, 3, 11}, 2));
    }



}
