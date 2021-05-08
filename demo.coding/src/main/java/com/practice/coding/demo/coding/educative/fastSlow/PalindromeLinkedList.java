package com.practice.coding.demo.coding.educative.fastSlow;

public class PalindromeLinkedList {

    public static boolean isPalindrome(Node head){
        if(head==null||head.next==null){
            return true;
        }
        Node fast = head;
        Node slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        Node headSecondHalf = reverse(slow);
        Node copyHeadSecondHalf = headSecondHalf;

        while(head!=null && headSecondHalf!=null){
            if(head.value!=headSecondHalf.value){
                break;
            }
            head = head.next;
            headSecondHalf = headSecondHalf.next;
        }
        reverse(copyHeadSecondHalf);
        if(head == null || headSecondHalf == null){
            return true;
        }
        return false;
    }

    private static Node reverse(Node node){
        Node curr = node;
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

    public static void main(String[] args){
        Node head1 = new Node(2);
        head1.next = new Node(4);
        head1.next.next = new Node(6);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(2);
        System.out.println();
        System.out.println(isPalindrome(head1));

        Node head2 = new Node(2);
        head2.next = new Node(4);
        head2.next.next = new Node(6);
        head2.next.next.next = new Node(4);
        head2.next.next.next.next = new Node(2);
        head2.next.next.next.next.next = new Node(2);
        System.out.println(isPalindrome(head2));

    }
}
