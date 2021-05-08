package com.practice.coding.demo.coding.educative.inplaceReversal;

public class ReverseSublist {

    public static Node reverseSublist(Node head, int p, int q){
        if(head==null){
            return head;
        }
        Node curr = head;
        Node prev = null;
        for(int i=0; i<p-1; i++){
            prev = curr;
            curr = curr.next;
        }

        Node lastNodeOfFirstPart = prev;
        Node lastNodeOfSubList = curr;
        Node next = null;
        for(int i=0; i<q-p+1; i++){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        if(lastNodeOfFirstPart!=null){
            lastNodeOfFirstPart.next = prev;
        }else{
            head = prev;
        }
        lastNodeOfSubList.next = curr;
        return head;
    }

    public static void main(String[] args){
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);
        System.out.print("Original list : ");
        Node original = head;
        while(original!=null){
            System.out.print(original.value + " ");
            original = original.next;
        }
        System.out.println();
        Node result = reverseSublist(head, 3,5);
        System.out.print("Reversed sublist : ");
        while(result!=null){
            System.out.print(result.value + " ");
            result = result.next;
        }

    }
}
