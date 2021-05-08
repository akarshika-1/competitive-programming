package com.practice.coding.demo.coding.educative.twoHeaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfANumberStream {

    PriorityQueue<Integer> maxHeap ;
    PriorityQueue<Integer> minHeap;

    public MedianOfANumberStream() {
        maxHeap = new PriorityQueue<>(Collections.reverseOrder());//new PriorityQueue<>((a,b)->b-a)
        minHeap = new PriorityQueue<>();//new PriorityQueue<>((a,b)->a-b)
    }

    public void insertNum(Integer num){
        if(maxHeap.isEmpty() || maxHeap.peek()>=num){
            maxHeap.add(num);
        }else{
            minHeap.add(num);
        }

        if(maxHeap.size()>minHeap.size()+1){
            minHeap.add(maxHeap.poll());
        }else if(maxHeap.size()<minHeap.size()){
            maxHeap.add(minHeap.poll());
        }
    }

    public double findMedian(){
        if(maxHeap.size()==minHeap.size()){
            return maxHeap.peek()/2.0 + minHeap.peek()/2.0;
        }else {
            return maxHeap.peek();
        }
    }

    public static void main(String[] args){
        MedianOfANumberStream medianOfANumberStream = new MedianOfANumberStream();
        medianOfANumberStream.insertNum(3);
        medianOfANumberStream.insertNum(1);
        System.out.println(medianOfANumberStream.findMedian());
        medianOfANumberStream.insertNum(5);
        System.out.println(medianOfANumberStream.findMedian());
        medianOfANumberStream.insertNum(4);
        System.out.println(medianOfANumberStream.findMedian());

    }
}
