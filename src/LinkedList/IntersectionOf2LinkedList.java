package LinkedList;

public class IntersectionOf2LinkedList {

    ListNode head = null;
    private class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA;
        ListNode b = headB;
        while( a != b){
            a = (a == null)? headB : a.next;
            b = (b == null)? headA : b.next;
        }
        return a;
    }
}
