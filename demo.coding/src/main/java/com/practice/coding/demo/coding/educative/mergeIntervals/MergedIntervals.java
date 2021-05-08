package com.practice.coding.demo.coding.educative.mergeIntervals;

import java.util.*;

public class MergedIntervals {

    public static List<Interval> mergedIntervals(List<Interval> intervals){
        if(intervals.size() < 2){
            return intervals;
        }
        Collections.sort(intervals, (a,b) -> a.start-b.start);
        Iterator<Interval> intervalIterator = intervals.iterator();
        Interval interval = intervalIterator.next();
        int start = interval.start;
        int end = interval.end;
        List<Interval> mergedIntervals = new ArrayList<>();
        while(intervalIterator.hasNext()){
            interval = intervalIterator.next();
            if(end >= interval.start){
                end = Math.max(end, interval.end);
            }else{
                mergedIntervals.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }
        mergedIntervals.add(new Interval(start, end));
        return mergedIntervals;
    }

    public static void main(String args[]){
        List<Interval> input1 = new ArrayList<>();
        input1.add(new Interval(1,4));
        input1.add(new Interval(2,6));
        input1.add(new Interval(3,5));
        List<Interval> result1 = mergedIntervals(input1);
        for(Interval interval : result1){
            System.out.print("["+interval.start+","+interval.end+"]");
        }
        System.out.println();

        List<Interval> input2 = new ArrayList<>();
        input2.add(new Interval(6,7));
        input2.add(new Interval(2,4));
        input2.add(new Interval(5,9));
        List<Interval> result2 = mergedIntervals(input2);
        for(Interval interval : result2){
            System.out.print("["+interval.start+","+interval.end+"]");
        }
        System.out.println();

    }
}
