package com.practice.coding.demo.coding.educative.inplaceReversal;

import com.practice.coding.demo.coding.educative.dfs.TreeNode;

public class ReverseAlternateSublist {

    public static Node reverse(Node head, int k){
        if(head==null || k<=1){
            return head;
        }
        Node prev = null;
        Node curr = head;
        while(true){
            Node lastNodeOfPreviousSublist = prev;
            Node lastNodeOfSublist = curr;
            Node next = null;
            for(int i=0; curr != null && i<k; i++){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            if(lastNodeOfPreviousSublist!=null){
                lastNodeOfPreviousSublist.next = prev;
            }else{
                head = prev;
            }

            lastNodeOfSublist.next = curr;

            for(int i=0; curr!=null && i<k; i++){
                prev = curr;
                curr = curr.next;
            }
            if(curr==null){
                break;
            }

        }
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
        Node result1 = reverse(head1, 3);
        while(result1!=null){
            System.out.print(result1.value+" ");
            result1 = result1.next;
        }
        System.out.println();
        Node head2 = new Node(1);
        head2.next = new Node(2);
        head2.next.next = new Node(3);
        head2.next.next.next = new Node(4);
        head2.next.next.next.next = new Node(5);
        head2.next.next.next.next.next = new Node(6);
        head2.next.next.next.next.next.next = new Node(7);
        head2.next.next.next.next.next.next.next = new Node(8);

        Node result2 = reverse(head2, 2);
        while(result2!=null){
            System.out.print(result2.value+" ");
            result2 = result2.next;
        }

    }
}
