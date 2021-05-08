package com.practice.coding.demo.coding.educative.topkElements;

import java.util.*;

public class RearrangeStringKDistance {

    public static String rearrangeStringKDistanceApart(String s, int k){
        if(k<=1){
            return s;
        }
        Map<Character, Integer> fm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            fm.put(s.charAt(i), fm.getOrDefault(s.charAt(i), 0)+1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((e1, e2)->e2.getValue()-e1.getValue());
        maxHeap.addAll(fm.entrySet());

        StringBuilder result = new StringBuilder();
        Queue<Map.Entry<Character, Integer>> q = new LinkedList<>();
        while(!maxHeap.isEmpty()){
            Map.Entry<Character, Integer> currentEntry = maxHeap.poll();
            result.append(currentEntry.getKey());
            currentEntry.setValue(currentEntry.getValue()-1);
            q.offer(currentEntry);

            if(q.size()==k){
                Map.Entry<Character, Integer> entry = q.poll();
                if(entry.getValue()>0){
                    maxHeap.add(entry);
                }
            }
        }
        return result.length()==s.length()?result.toString():"";
    }

    public static void main(String[] args) {
        System.out.println(rearrangeStringKDistanceApart("mmpp", 2));
        System.out.println(rearrangeStringKDistanceApart("Programming", 3));
        System.out.println(rearrangeStringKDistanceApart("aab", 2));
        System.out.println(rearrangeStringKDistanceApart("aappa", 3));

    }
}
