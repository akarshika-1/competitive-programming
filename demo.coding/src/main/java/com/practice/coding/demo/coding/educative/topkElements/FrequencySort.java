package com.practice.coding.demo.coding.educative.topkElements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {

    public static String frequencySort(String s){
        Map<Character, Integer> characterFrequencyMap = new HashMap<>();
        char[] input = s.toCharArray();
        for(int i=0;i<input.length;i++){
            characterFrequencyMap.put(input[i], characterFrequencyMap.getOrDefault(input[i],0)+1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((e1,e2)->e2.getValue()-e1.getValue());
        maxHeap.addAll(characterFrequencyMap.entrySet());
        StringBuilder sb = new StringBuilder(s.length());
        while(!maxHeap.isEmpty()){
            Map.Entry<Character, Integer> entry = maxHeap.poll();
            for(int i=0;i<entry.getValue();i++)
            sb.append(entry.getKey());
        }
        return sb.toString();
    }

    public static void main(String[] args){
        System.out.println(frequencySort("Programming"));
        System.out.println(frequencySort("GeeksForGeeks"));
    }
}
