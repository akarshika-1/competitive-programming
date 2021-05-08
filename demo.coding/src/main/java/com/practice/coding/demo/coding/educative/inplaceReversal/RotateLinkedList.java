package com.practice.coding.demo.coding.educative.inplaceReversal;

public class RotateLinkedList {

    public static Node rotate(Node head, int k){
        if(head==null || head.next == null || k<1){
            return head;
        }
        int listLength = 1;
        Node lastNode = head;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
            listLength += 1;
        }
        lastNode.next = head;
        int skipLength = listLength - k%listLength;
        Node lastNodeOfRotatedList = head;
        for(int i=0; i<skipLength-1; i++){
            lastNodeOfRotatedList = lastNodeOfRotatedList.next;
        }
        head = lastNodeOfRotatedList.next;
        lastNodeOfRotatedList.next = null;
        return head;
    }


    public static void main(String[] args) {
        Node head1 = new Node(1);
        head1.next = new Node(2);
        head1.next.next = new Node(3);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(5);
        head1.next.next.next.next.next = new Node(6);
        head1.next.next.next.next.next.next = new Node(7);
        head1.next.next.next.next.next.next.next = new Node(8);
        Node result1 = rotate(head1, 3);
        while (result1 != null) {
            System.out.print(result1.value + " ");
            result1 = result1.next;
        }
    }
}
