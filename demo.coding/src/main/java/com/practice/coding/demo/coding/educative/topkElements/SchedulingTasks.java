package com.practice.coding.demo.coding.educative.topkElements;

import java.util.*;

public class SchedulingTasks {

    public static int findCpuInterval(char[] a, int k){
        int count = 0;

        Map<Character, Integer> fm = new HashMap<>();
        for(char c : a){
            fm.put(c, fm.getOrDefault(c, 0)+1);
        }

        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((e1,e2)->e2.getValue()-e1.getValue());
        maxHeap.addAll(fm.entrySet());

        while(!maxHeap.isEmpty()){
            int n = k+1;
            List<Map.Entry<Character, Integer>> waitingList = new ArrayList<>();
            for(;n>0&&!maxHeap.isEmpty(); n--){
                count++;
                Map.Entry<Character, Integer> entry = maxHeap.poll();
                if(entry.getValue()>1){
                    entry.setValue(entry.getValue()-1);
                    waitingList.add(entry);
                }
            }
            maxHeap.addAll(waitingList);
            if(!maxHeap.isEmpty()){
                count += n;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findCpuInterval(new char[]{'a', 'a', 'a', 'b', 'c', 'c'}, 2));
        System.out.println(findCpuInterval(new char[]{'a', 'b', 'a'}, 3));
    }
}
