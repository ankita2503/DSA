package Stack;

import java.util.Objects;

public class Stack {

    public class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    private boolean isEmpty(){
        return Objects.isNull(head);
    }

    private void push(int data){
        Node newNode = new Node(data);
        if(isEmpty()) {
            head = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    private int pop(){
        if(isEmpty()) {
            return -1;
        }
        int popData = head.data;
        head = head.next;
        return popData;
    }

    private int peek(){
        if(isEmpty()) {
            return -1;
        }
        return head.data;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);

        System.out.println(stack.pop());
        System.out.println(stack.peek())
    ;
    }
}
