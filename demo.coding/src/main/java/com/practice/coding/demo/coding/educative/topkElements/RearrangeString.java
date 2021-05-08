package com.practice.coding.demo.coding.educative.topkElements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RearrangeString {
    public static String rearrangeString(String s){
        Map<Character, Integer> charFrequency = new HashMap<>();
        for(int i =0; i<s.length(); i++){
            charFrequency.put(s.charAt(i), charFrequency.getOrDefault(s.charAt(i), 0)+1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((e1, e2)->e2.getValue()-e1.getValue());
        maxHeap.addAll(charFrequency.entrySet());

        StringBuilder result = new StringBuilder();
        Map.Entry<Character, Integer> previousEntry = null;
        while (!maxHeap.isEmpty()){
            Map.Entry<Character, Integer> currentEntry = maxHeap.poll();

            if(previousEntry!=null && previousEntry.getValue()>0){
                maxHeap.offer(previousEntry);
            }

            result.append(currentEntry.getKey());
            currentEntry.setValue(currentEntry.getValue()-1);
            previousEntry = currentEntry;
        }

        return result.length()==s.length()?result.toString():"";

    }

    public static void main(String[] args) {
        System.out.println(rearrangeString("aappp"));
        System.out.println(rearrangeString("Programming"));
        System.out.println(rearrangeString("aapa"));

    }
}
