package com.practice.coding.demo.coding.educative.topkElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class TopKNumbers {

    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    public List<Integer> topKElements(int a[], int k){
        for(int i=0; i<a.length; i++){
            maxHeap.offer(a[i]);
        }

        List<Integer> topKElements = new ArrayList<>();

        for(int i=0;i<k;i++){
            topKElements.add(maxHeap.poll());
        }
        return topKElements;

    }

    public static void main(String args[]){
        TopKNumbers topKNumbers1 = new TopKNumbers();
        System.out.println(topKNumbers1.topKElements(new int[]{3,1,5,12,2,11}, 3));
        TopKNumbers topKNumbers2 = new TopKNumbers();
        System.out.println(topKNumbers2.topKElements(new int[]{5,12,11, -1, 12}, 3));
    }
}
