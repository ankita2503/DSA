package LinkedList;

public class LinkedList {
    int size = 0;
    public LinkedList(int size) {
        this.size = size;
    }
    Node head = null;
    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    private void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    private void addLast(int data) {
        Node newLastNode = new Node(data);
        Node lastNode = head;
        if (head == null) {
            head = newLastNode;
            return;
        }
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newLastNode;
    }

    private void addMiddle(int data, int index) {
        Node newMiddleNode = new Node(data);
        if (head == null) {
            head = newMiddleNode;
            return;
        }
        Node currNode = head;
        while (--index > 0) {
            currNode = currNode.next;
        }
        newMiddleNode.next = currNode.next;
        currNode.next = newMiddleNode;
    }

    private void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        size--;
    }

    private void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
        }
        Node currNode = head;
        while (currNode.next.next != null) {
            currNode = currNode.next;
        }
        currNode.next = null;
        size--;
    }

    private void reverse(){
        Node prev = head;
        Node current = head.next;
        Node next = head.next.next;

        while(next!=null){
            current.next = prev;
            prev = current;
            current = next;
            next = next.next;
        }

        current.next = prev;
        head.next = null;
        head = current;
    }

    private Node reverserecursion(Node head){
        if(head == null || head.next == null)
            return head;
        Node newHead = reverserecursion(this.head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }


    private void printList() {
        if (head == null) {
            return;
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }


    }

    public Node removeElements(Node head, int val) {
        if(head == null) return null;
        Node next = removeElements(head.next, val);
        if(head.data == val) return next;
        head.next = next;
        return head;
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList(0);
        list.addFirst(3);
        list.addFirst(34);
        list.addLast(100);
        list.addMiddle(200, 1);
        //list.deleteFirst();
        //list.deleteLast();
       // list.printList();
        list.reverserecursion(list.head);
        list.printList();
        System.out.println("");
        System.out.println("Linked List size : " + list.size);
    }


}
