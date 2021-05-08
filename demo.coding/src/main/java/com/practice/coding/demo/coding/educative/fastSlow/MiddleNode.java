package com.practice.coding.demo.coding.educative.fastSlow;

public class MiddleNode {

    public static Node middleNode(Node head){
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        System.out.println(middleNode(head).value);
        head.next.next.next.next.next = new Node(6);
        System.out.println(middleNode(head).value);
        head.next.next.next.next.next.next = new Node(7);
        System.out.println(middleNode(head).value);
    }
}
