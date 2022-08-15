package Queue;

import java.util.Stack;

public class QueueUsingStack {

   Stack<Integer> s1 = new Stack();
    Stack<Integer> s2 = new Stack();

    public boolean isEmpty() {
        if (s1.isEmpty()) {
            return true;
        }
        return false;
    }

    public void add(Integer data) {

        if(s1.isEmpty()){
            s1.push(data);
            return;
        }

        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(data);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }

    public int remove() {
        if (s1.isEmpty()) {
            return -1;
        }

        return s1.pop();
    }

    public int peek() {
        if (s1.isEmpty()) {
            return -1;
        }
        return s1.peek();
    }

    public static void main(String[] args) {
        QueueUsingStack queue = new QueueUsingStack();
        queue.add(1);
        queue.add(2);
        queue.add(3);

        queue.remove();
        System.out.println(queue.peek());
    }
}
