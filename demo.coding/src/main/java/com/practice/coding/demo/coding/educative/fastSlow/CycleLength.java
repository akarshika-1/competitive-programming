package com.practice.coding.demo.coding.educative.fastSlow;

public class CycleLength {

    public static int cycleLength(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                return length(slow) ;
            }
        }
        return 0;
    }

    private static int length(Node slow){
        Node current = slow;
        int l = 0;
        do{
            current = current.next;
            l++;
        }while(current!=slow);
        return l;
    }

    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = head.next.next;
        System.out.println(cycleLength(head));
    }
}
