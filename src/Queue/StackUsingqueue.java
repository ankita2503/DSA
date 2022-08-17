package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingqueue {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int data){

        q2.add(data);
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<Integer> tempQ = q1;
        q1 = q2;
        q2 = tempQ;
    }

    public int pop(){
        if(q1.isEmpty()){
            return -1;
        }
       return q1.remove();
    }

    public int top(){
        if(q1.isEmpty()){
            return -1;
        }
        return q1.peek();
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
