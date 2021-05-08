package com.practice.coding.demo.coding.geeksforgeeks.hashing;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

class Node{
    int value;
    Node next;

    public Node(int value) {
        this.value = value;
    }
}

public class UnionAndIntersectionOfList {

    public static void main(String[] args){
        Node list1 = new Node(10);
        list1.next = new Node(15);
        list1.next.next = new Node(4);
        list1.next.next.next = new Node(20);

        Node list2 = new Node(8);
        list2.next = new Node(4);
        list2.next.next = new Node(2);
        list2.next.next.next = new Node(10);
        find(list1, list2);


    }

    public static void find(Node  head1, Node head2){
        HashMap<Integer, Integer> valueCountMap = new HashMap<>();
        while (head1!=null){
            valueCountMap.put(head1.value, valueCountMap.getOrDefault(head1.value, 0)+1);
            head1 = head1.next;
        }

        while (head2!=null){
            valueCountMap.put(head2.value, valueCountMap.getOrDefault(head2.value, 0)+1);
            head2 = head2.next;
        }
        System.out.print("Union : "+ union(valueCountMap));
        System.out.println();
        System.out.print("Intersection : "+ intersection(valueCountMap));
    }

    private static List<Integer> intersection(HashMap<Integer, Integer> valueCountMap) {
        List<Integer> intersection = new ArrayList<>();
        for(Map.Entry<Integer,Integer> map : valueCountMap.entrySet()){
            if(map.getValue()==2){
                intersection.add(map.getKey());
            }
        }
        return intersection;
    }

    private static List<Integer> union(HashMap<Integer, Integer> valueCountMap) {
        List<Integer> union = new ArrayList<>();
        for(Map.Entry<Integer,Integer> map : valueCountMap.entrySet()){
            union.add(map.getKey());
        }
        return union;
    }


}
