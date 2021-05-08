package com.practice.coding.demo.coding.educative.inplaceReversal;

public class ReverseList {

    public static Node reverseList(Node head){
        Node current = head;
        Node previous = null;
        Node next = null;
        while(current != null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        System.out.print("Original list :");
        Node cur = head;
        while (cur != null){
            System.out.print( cur.value +" ");
            cur = cur.next;
        }
        Node result = reverseList(head);
        System.out.println();
        System.out.print("Reversed list :");
        while (result != null){
           System.out.print(result.value +" ");
           result = result.next;
        }
    }


}
