package com.practice.coding.demo.coding.educative.mergeIntervals;

import com.practice.coding.demo.coding.educative.slidingWindow.SubarrayAvg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {

    public static List<Interval> insertInterval(List<Interval> intervals, Interval newInterval){
        if(intervals==null||intervals.isEmpty()){
            return Arrays.asList(newInterval);
        }
        List<Interval> mergedIntervals = new ArrayList<>();

        int i=0;
        while(i<intervals.size() && intervals.get(i).end<newInterval.start)
            mergedIntervals.add(intervals.get(i++));

        while(i<intervals.size() && newInterval.end>=intervals.get(i).start){
            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
            newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
            i++;
        }

        mergedIntervals.add(newInterval);

        while(i<intervals.size()){
            mergedIntervals.add(intervals.get(i++));
        }
        return mergedIntervals;
    }

    public static void main(String[] agrs){
        List<Interval> i1 = Arrays.asList(new Interval(1,3), new Interval(5,7), new Interval(8,12));
        List<Interval> result1 = insertInterval(i1, new Interval(4,6));
        for(Interval interval : result1){
            System.out.print("["+interval.start+","+interval.end+"]");
        }
        System.out.println();
        List<Interval> i2 = Arrays.asList(new Interval(1,3), new Interval(5,7), new Interval(8,12));
        List<Interval> result2 = insertInterval(i2, new Interval(4,10));
        for(Interval interval : result2){
            System.out.print("["+interval.start+","+interval.end+"]");
        }
        System.out.println();
        List<Interval> i3 = Arrays.asList(new Interval(2,3), new Interval(5,7));
        List<Interval> result3 = insertInterval(i3, new Interval(1,4));
        for(Interval interval : result3){
            System.out.print("["+interval.start+","+interval.end+"]");
        }
        System.out.println();
        List<Interval> i4 = Arrays.asList(new Interval(1,3), new Interval(6,7), new Interval(8,12));
        List<Interval> result4 = insertInterval(i4, new Interval(4,6));
        for(Interval interval : result4){
            System.out.print("["+interval.start+","+interval.end+"]");
        }
    }
}
