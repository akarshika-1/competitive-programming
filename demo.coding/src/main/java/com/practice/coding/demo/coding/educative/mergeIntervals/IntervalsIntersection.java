package com.practice.coding.demo.coding.educative.mergeIntervals;

import java.util.ArrayList;
import java.util.List;

public class IntervalsIntersection {

    public static List<Interval> findIntersections(Interval[] a1, Interval[] a2){
        int i=0, j=0;
        List<Interval> intersections = new ArrayList<>();
        while(i< a1.length && j<a2.length){
            if((a1[i].start>=a2[j].start && a1[i].start<=a2[j].end)||
                    (a2[j].start>=a1[i].start && a2[j].start<=a1[i].end)){
                intersections.add(new Interval(Math.max(a1[i].start, a2[j].start), Math.min(a1[i].end, a2[j].end)));
            }
            if(a1[i].end<a2[j].end){
                i++;
            }else{
                j++;
            }
        }
        return intersections;
    }

    public static void main(String[] args){
        Interval[] a1 = new Interval[]{new Interval(1,3), new Interval(5,6), new Interval(7,9)};
        Interval[] a2 = new Interval[]{new Interval(2,3), new Interval(5,7)};
        List<Interval> result1 = findIntersections(a1, a2);
        for(Interval interval : result1){
            System.out.print("["+interval.start+","+interval.end+"]");
        }
        System.out.println();

        Interval[] a3 = new Interval[]{new Interval(1,3), new Interval(5,7), new Interval(9,12)};
        Interval[] a4 = new Interval[]{new Interval(5,10)};
        List<Interval> result2 = findIntersections(a3, a4);
        for(Interval interval : result2){
            System.out.print("["+interval.start+","+interval.end+"]");
        }
        System.out.println();
    }
}
