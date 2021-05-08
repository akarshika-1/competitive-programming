package com.practice.coding.demo.coding.educative.mergeIntervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MinimumMeetingRooms {

    public static int roomRequired(List<Interval> meetings){
        Collections.sort(meetings, (a,b)->Integer.compare(a.start, b.start));
        int minRoom = 0;

        PriorityQueue<Interval> minHeap = new PriorityQueue<>(meetings.size(), (a,b)->Integer.compare(a.end, b.end));
        for(Interval meeting : meetings){
            while(!minHeap.isEmpty() && meeting.start>= minHeap.peek().end){
                minHeap.poll();
            }

            minHeap.offer(meeting);
            minRoom = Math.max(minRoom, minHeap.size());
        }
        return minRoom;
    }

    public static void main(String[] args) {
        List<Interval> intervals1 = new ArrayList<>();
        intervals1.add(new Interval(4,5));
        intervals1.add(new Interval(2,3));
        intervals1.add(new Interval(2,4));
        intervals1.add(new Interval(3,5));
        System.out.println(roomRequired(intervals1));

        List<Interval> intervals2 = new ArrayList<>();
        intervals2.add(new Interval(1,4));
        intervals2.add(new Interval(2,5));
        intervals2.add(new Interval(7,9));
        System.out.println(roomRequired(intervals2));

        List<Interval> intervals3 = new ArrayList<>();
        intervals3.add(new Interval(6,7));
        intervals3.add(new Interval(2,4));
        intervals3.add(new Interval(8,12));
        System.out.println(roomRequired(intervals3));
    }
}
