package com.practice.coding.demo.coding.educative.fastSlow;

public class StartOfLLCycle {

    public static Node startOfCycle(Node head){
        Node slow = head;
        Node fast = head;
        int len = 0;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){
                len = lengthOfList(slow);
                break;
            }
        }
        Node start = findStart(head, len);
        return start;
    }

    public static int lengthOfList(Node slow){
        Node curr = slow;
        int len = 0;
        do{
            len++;
            curr = curr.next;
        }while(curr!=slow);
        return len;
    }

    public static Node findStart(Node head, int length){
        Node p1 = head;
        Node p2 = head;
        while(length>0){
            p2 = p2.next;
            length--;
        }
        while (p1!=p2){
            p1 = p1.next;
            p2 = p2.next;
        }
        return p2;
    }

    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = head.next.next;
        System.out.println(startOfCycle(head).value);
        head.next.next.next.next.next.next = head.next.next.next;
        System.out.println(startOfCycle(head).value);
        head.next.next.next.next.next.next = head;
        System.out.println(startOfCycle(head).value);
    }
}
