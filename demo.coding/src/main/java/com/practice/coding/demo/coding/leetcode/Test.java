package com.practice.coding.demo.coding.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Interval{
    int start;
    int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class Test {

    //abcdeabcd
    //dcbaeabcd

    //a1 = arrival time [1,a,3,a, 10,a, 12,a]
    //a2 = departure time [3,d, 4,d, 15,d, 13,d]

    //1a, 3d, 3a, 4d, 10 a, 12a, 13d, 15d


    public int numOfRunnways(int[] arr, int[] dep){
        List<Interval> intervals = new ArrayList<>();
        for(int i=0;i<arr.length; i++){
            intervals.add(new Interval(arr[i], dep[i]));
        }
        Collections.sort(intervals, (a,b)->a.start-b.start);
        Collections.sort(intervals, (a,b)->a.end-b.end);
        int count = 0;
        for(int i=0; i<intervals.size()-1; i++){

            while(intervals.get(i).start>=intervals.get(i).end ){
                count++;
                i++;
            }
        }
        /*int count = 0;
        Arrays.sort(arr);
        Arrays.sort(dep);
        for(int i=0; i<arr.length; i++){
            int j=0;
            while(j<dep.length && arr[i]>=dep[j]){
                count++;
                j++;
            }
        }*/
        return count;
    }

}
