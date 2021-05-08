package com.practice.coding.demo.coding.educative.mergeIntervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Job{
    int start;
    int end;
    int cpuLoad;

    public Job(int start, int end, int cpuLoad) {
        this.start = start;
        this.end = end;
        this.cpuLoad = cpuLoad;
    }
}

public class MaximumCpuLoad {

    public static int maxCpuLoad(List<Job> jobList){
        Collections.sort(jobList, (a,b)->Integer.compare(a.start, b.start));
        PriorityQueue<Job> minHeap = new PriorityQueue<>(jobList.size(), (a,b)->Integer.compare(a.end, b.end));
        int maxLoad = 0;
        int currLoad = 0;
        for(Job job : jobList){
            while(!minHeap.isEmpty() && job.start>minHeap.peek().end){
                currLoad -= minHeap.poll().cpuLoad;
            }
            minHeap.offer(job);
            currLoad += job.cpuLoad;
            maxLoad = Math.max(maxLoad, currLoad);
        }
        return maxLoad;
    }

    public static void main(String[] args) {
        List<Job> jobList1 = new ArrayList<>();
        jobList1.add(new Job(1,4,3));
        jobList1.add(new Job(2,5,4));
        jobList1.add(new Job(7,9,6));
        System.out.println(maxCpuLoad(jobList1));

        List<Job> jobList2 = new ArrayList<>();
        jobList2.add(new Job(6,7,10));
        jobList2.add(new Job(2,4,11));
        jobList2.add(new Job(8,12,15));
        System.out.println(maxCpuLoad(jobList2));

        List<Job> jobList3 = new ArrayList<>();
        jobList3.add(new Job(1,4,2));
        jobList3.add(new Job(2,4,1));
        jobList3.add(new Job(3,6,5));
        System.out.println(maxCpuLoad(jobList3));
    }
}
