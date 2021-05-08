package com.practice.coding.demo.coding.educative.topkElements;

import java.util.PriorityQueue;

public class ConnectRopes {

    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public int ropeCost(int[] a){
        for(int i=0;i<a.length;i++){
            minHeap.add(a[i]);
        }
        int temp=0;
        int result = 0;
        while(minHeap.size()>1){
            temp = minHeap.poll()+minHeap.poll();
            result+=temp;
            minHeap.offer(temp);
        }
        return result;
    }

    public static void main(String[] args){
        ConnectRopes connectRopes1 = new ConnectRopes();
        System.out.println(connectRopes1.ropeCost(new int[]{1,3,11,5}));
        ConnectRopes connectRopes2 = new ConnectRopes();
        System.out.println(connectRopes2.ropeCost(new int[]{3,4,5,6}));
        ConnectRopes connectRope3 = new ConnectRopes();
        System.out.println(connectRope3.ropeCost(new int[]{1,3,11,5,2}));
    }
}
