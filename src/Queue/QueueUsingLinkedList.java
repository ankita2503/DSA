package Queue;

public class QueueUsingLinkedList {

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


    Node head;
    Node tail;

    public boolean isEmpty() {
        if (head == null && tail == null) {
            return true;
        }
        return false;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public int remove() {
        if (isEmpty()) {
            return -1;
        }
        int removedData = head.data;
        if (head == tail) {
            tail = null;
        }
        head = head.next;
        return removedData;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        QueueUsingLinkedList queue = new QueueUsingLinkedList();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        queue.remove();
        System.out.println(queue.peek());
    }
}
