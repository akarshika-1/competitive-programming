package com.practice.coding.demo.coding.educative.mergeIntervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConflictingAppointments {

    public static boolean willAttend(List<Interval> intervals){
        Collections.sort(intervals, (a,b)-> Integer.compare(a.start, b.start));
        for(int i=1; i<intervals.size();i++){
            if(intervals.get(i).start<intervals.get(i-1).end){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        List<Interval> intervals1 = Arrays.asList(new Interval(1,4), new Interval(2,5), new Interval(7,9));
        System.out.println(willAttend(intervals1));
        List<Interval> intervals2 = Arrays.asList(new Interval(6,7), new Interval(2,4), new Interval(8,12));
        System.out.println(willAttend(intervals2));
    }
}
