package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingSinglequeue {

    Queue<Integer> q = new LinkedList<>();

    public void push(int data){
      if(q.isEmpty()){
          q.add(data);
          return;
      }
      q.add(data);
      for(int i=0;i<q.size()-1;i++){
          q.add(q.poll());
      }
    }

    public int pop(){
        if(q.isEmpty()){
            return -1;
        }
       return q.remove();
    }

    public int top(){
        if(q.isEmpty()){
            return -1;
        }
        return q.peek();
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
