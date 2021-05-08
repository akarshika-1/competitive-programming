package com.practice.coding.demo.coding.educative.topkElements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class ClosestToOrigin {

    PriorityQueue<Point> maxHeap = new PriorityQueue<>((p1,p2)->p2.distFromOrigin()-p1.distFromOrigin());

    public List<Point> kClosestPoints(Point[] points, int k){
        for(int i=0;i<k;i++){
            maxHeap.offer(points[i]);
        }

        for(int i=k;i<points.length;i++){
            if(points[i].distFromOrigin()<maxHeap.peek().distFromOrigin()){
                maxHeap.poll();
                maxHeap.add(points[i]);
            }
        }
        return new ArrayList<>(maxHeap);
    }

    public static void main(String[] args){
        ClosestToOrigin closestToOrigin1 = new ClosestToOrigin();
        List<Point> result1=closestToOrigin1.kClosestPoints(new Point[]{new Point(1,2), new Point(1,3)}, 1);
        for(Point point:result1){
            System.out.print("["+point.x+" "+point.y+"]");
        }
        System.out.println();
        ClosestToOrigin closestToOrigin2 = new ClosestToOrigin();
        List<Point> result2=closestToOrigin2.kClosestPoints(new Point[]{new Point(1,3), new Point(3,4), new Point(2,-1)}, 2);
        for(Point point:result2){
            System.out.print("["+point.x+" "+point.y+"]");
        }
    }



}
