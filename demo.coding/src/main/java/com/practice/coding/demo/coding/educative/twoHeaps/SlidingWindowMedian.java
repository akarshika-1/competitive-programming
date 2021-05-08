package com.practice.coding.demo.coding.educative.twoHeaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class SlidingWindowMedian {

    PriorityQueue<Integer> maxHeap = new PriorityQueue<> (Collections.reverseOrder());;
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public double[] findSlidingWindowMedian(int[] a, int k){
        double[] result = new double[a.length-k+1];
        for(int i=0; i<a.length;i++){
            if(maxHeap.size()==0 || maxHeap.peek()>=a[i]){
                maxHeap.add(a[i]);
            }else{
                minHeap.add(a[i]);
            }
            reBalanceHeaps();
            if(i-k+1>=0){
                if(maxHeap.size()==minHeap.size()){
                    result[i-k+1]=maxHeap.peek()/2.0+minHeap.peek()/2.0;
                }else {
                    result[i-k+1]=maxHeap.peek();
                }
                int elementToBeRemoved = a[i-k+1];
                if(elementToBeRemoved<=maxHeap.peek()){
                    maxHeap.remove(elementToBeRemoved);
                }else{
                    minHeap.remove(elementToBeRemoved);
                }
                reBalanceHeaps();
            }

        }
        return result;
    }

    public void reBalanceHeaps(){
        if(maxHeap.size()>minHeap.size()+1){
            minHeap.add(maxHeap.poll());
        }else if(maxHeap.size()<minHeap.size()){
            maxHeap.add(minHeap.poll());
        }
    }

    public static void main(String[] args){
        SlidingWindowMedian slidingWindowMedian1 = new SlidingWindowMedian();
        System.out.println(Arrays.toString(slidingWindowMedian1.findSlidingWindowMedian(new int[]{1, 2, -1, 3, 5}, 2)));
        SlidingWindowMedian slidingWindowMedian2= new SlidingWindowMedian();
        System.out.println(Arrays.toString(slidingWindowMedian2.findSlidingWindowMedian(new int[]{1, 2, -1, 3, 5}, 3)));
    }
}
