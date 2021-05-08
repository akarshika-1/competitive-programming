package com.practice.coding.demo.coding.educative.twoHeaps;

import java.util.PriorityQueue;

public class MaximizeCapital {

    public static int findMaximumCapital(int[] capitals, int[] profits, int numOfProjects, int initialCapital){
        int n = profits.length;
        PriorityQueue<Integer> minHeapCapitals = new PriorityQueue<>(n,(i1,i2)->capitals[i1]-capitals[i2]);
        PriorityQueue<Integer> maxHeapProfits = new PriorityQueue<>(n,(i1,i2)->profits[i2]-profits[i1]);
        for(int i=0;i<n;i++){
            minHeapCapitals.offer(i);
        }
        int availableCapital = initialCapital;

        for(int i=0;i<numOfProjects;i++){
            while (!minHeapCapitals.isEmpty() && capitals[minHeapCapitals.peek()]<=availableCapital){
                maxHeapProfits.add(minHeapCapitals.poll());
            }
            if(maxHeapProfits.isEmpty()){
                break;
            }
            availableCapital +=profits[maxHeapProfits.poll()];
        }
        return availableCapital;
    }

    public static void main(String[] args){
        System.out.println(findMaximumCapital(new int[]{0,1,2}, new int[]{1,2,3}, 2, 1));
        System.out.println(findMaximumCapital(new int[]{0,1,2,3}, new int[]{1,2,3,5}, 3, 0));
    }
}
