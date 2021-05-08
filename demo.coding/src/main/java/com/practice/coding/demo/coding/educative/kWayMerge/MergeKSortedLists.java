package com.practice.coding.demo.coding.educative.kWayMerge;



import java.util.PriorityQueue;

public class MergeKSortedLists {

    public static Node merge(Node[] nodes){
        PriorityQueue<Node> minHeap = new PriorityQueue<Node>((v1,v2)->v1.value - v2.value);

        for(Node head: nodes){
            if(head!=null){
                minHeap.add(head);
            }
        }

        Node resultHead = null;
        Node resultTail = null;

        while(!minHeap.isEmpty()){
            Node node = minHeap.poll();
            if(resultHead==null){
                resultHead=resultTail=node;
            }else{
                resultTail.next = node;
                resultTail = resultTail.next;
            }

            if(node.next!=null){
                minHeap.add(node.next);
            }
        }
        return resultHead;
    }

    public static void main(String[] args){
        Node l1 = new Node(1);
        l1.next = new Node(3);
        l1.next.next = new Node(4);

        Node l2 = new Node(2);
        l2.next = new Node(6);
        l2.next.next = new Node(8);

        Node l3 = new Node(3);
        l3.next = new Node(6);
        l3.next.next = new Node(7);

        Node result = merge(new Node[]{l1,l2,l3});
        while(result!=null){
            System.out.print(result.value+" ");
            result = result.next;
        }

    }
}
