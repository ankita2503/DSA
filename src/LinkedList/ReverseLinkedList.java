package LinkedList;

public class ReverseLinkedList {


    private class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static void main(String[] args) {

        ListNode head = null;

        if(head == null){
            System.out.println(head);
        }

        if(head.next == null){
            System.out.println(head);
        }

        ListNode prev = head;
        ListNode current = head.next;
        ListNode next = head.next.next;

        reverse(prev, current,next,head);
    }

    private static ListNode reverse(ListNode prev, ListNode current, ListNode next, ListNode head){
        if(next == null){
            current.next = prev;
            head.next = null;
            head = current;
            return head;
        }

        current.next  =prev;

        return reverse(current, next, next.next, head);
    }
}
