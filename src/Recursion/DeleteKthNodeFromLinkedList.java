package Recursion;

import LinkedList.LinkedList;

public class DeleteKthNodeFromLinkedList {


    static Node a;
    static class Node {
        int data;
        Node next;
    }

    ;

    // Utility function to insert a node at the beginning /
    static Node push(Node head, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head;
        head = new_node;
        return head;
    }

    // Utility function to print a linked list /
    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.printf("\n");
    }

    static void printAlternateListReverse(Node start) {
        if (start == null) {
            return;
        }

        printAlternateListReverse(start.next.next);
        System.out.printf(start.data + "->");
    }

    static void printAlternateList(Node start) {
        if (start == null) {
            return;
        }
        System.out.printf(start.data + "->");
        printAlternateList(start.next.next);

        System.out.println(" ");
    }

    static Node reverse(Node head) {
        Node prev = null;
        Node next = null;
        Node current = head;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static int pairSum(Node head) {
        Node start = head;
        Node end = head;
        while(end.next!=null){
            start.next=head.next;
            end = end.next;
        }
        Node prev = null;
        Node current=head;
        Node newHead=head;
        Node next = null;
        int n=0;
        int sum = 0;


        while(current!=null){
            next = current.next;
            current.next = prev;
            prev=current;
            current=next;
            n++;
        }
        int k = n/2;

        while(k>0){
            int s1 = start.next.data;
            int s2 = prev.next.data;
            System.out.println("s1:"+s1);
            System.out.println("s2:"+s2);
            sum = Math.max(sum,s1+s2);
            start=start.next;
            prev = prev.next;
            k--;
        }

        return sum;
    }

    static Node reverseRecursive(Node head) {
      if(head== null || head.next==null){
          return head;
      }
        Node recHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;
      return recHead;
    }

    static Node deleteNode(Node start, int k) {
        // If invalid k
        if (k < 1)
            return start;

        // If linked list is empty
        if (start == null)
            return null;

        // Base case (start needs to be deleted)
        if (k == 1) {
            Node res = start.next;
            return res;
        }

        Node node = deleteNode(start.next, k - 1);
        start.next = node;
        return start;
    }

    static void alternateSplit(Node start) {
        if (start == null)
            return;
        alternateSplit(start.next.next);
        start.next = start;
    }

    //12 15 10 5 5 2 3
    static Node removeNthFromEnd(Node head,int n) {
        if(head==null || head.next == null){
            return head;
        }
        removeNthFromEnd(head.next,n-1);
        n=n-1;
        if(n==-1){
            head.next=head.next.next;
        }
        return head;
    }


    static int findSum(Node head , Node start, Node end, int sum) {
        if (end == null)
            return 0;
        findSum(head, start, end.next, sum);
        if (sum == 0) {
            sum = sum + start.data +end.data;
        } else {
            sum = sum + start.next.data +end.data;
        }

        return sum;
    }

    //12 15 10 11 5 6 2 3
    public static Node removeElements(Node head, int val) {
        if(head == null) {
            return head;
        }
        Node next = removeElements(head.next, val);
        if(head.data == val) {
            return next;
        }
        head.next = next;
        return head;
    }

    //12 15 10 5 5 2 3
    public static Node reverseRecursionLinkedlist(Node head) {
        if(head.next==null) {
            return head;
        }
        Node node = reverseRecursionLinkedlist(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }
    public static void main(String[] args) {
        Node head = null;

        head = push(head, 5);
        head = push(head, 4);
        head = push(head, 3);
        head = push(head, 2);
        head = push(head, 1);


        //int k = 6;


        // printAlternateList(head);
        //printAlternateListReverse(head);
        //alternateSplit(a);

        //removeElements(head, 5);
        pairSum(head);
        //printList(reverseRecursive(head));
        printList(removeNthFromEnd(head,2));

    }
}
