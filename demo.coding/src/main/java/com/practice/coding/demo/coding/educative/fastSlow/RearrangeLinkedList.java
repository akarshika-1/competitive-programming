package com.practice.coding.demo.coding.educative.fastSlow;

public class RearrangeLinkedList {

    public static Node rearrangeLinkedList(Node head){
        if(head == null || head.next == null){
            return head;
        }

        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node headSecondHalf = reverse(slow);
        Node headFirstHalf = head;
        while(headFirstHalf!=null && headSecondHalf!=null){
            Node temp = headFirstHalf.next;
            headFirstHalf.next = headSecondHalf;
            headFirstHalf = temp;

            temp = headSecondHalf.next;
            headSecondHalf.next = headFirstHalf;
            headSecondHalf = temp;
        }
        if(headFirstHalf!=null){
            headFirstHalf.next = null;
        }
        return head;
    }

    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void printLinkedList(Node head){
        while(head!=null){
            System.out.print(head.value+" ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Node head1 = new Node(2);
        head1.next = new Node(4);
        head1.next.next = new Node(6);
        head1.next.next.next = new Node(8);
        head1.next.next.next.next = new Node(10);
        head1.next.next.next.next.next = new Node(12);
        rearrangeLinkedList(head1);
        printLinkedList(head1);


        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(8);
        head2.next.next.next.next = new Node(10);
        rearrangeLinkedList(head2);
        printLinkedList(head2);


    }
}
