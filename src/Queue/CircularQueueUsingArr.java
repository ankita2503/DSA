package Queue;

public class CircularQueueUsingArr {

    int [] arr;
    int size;
    int rear = -1;
    int front = -1;

    public  CircularQueueUsingArr(int size){
        arr = new int[size];
        this.size = size;
    }


    public boolean isEmpty(){
        if(front == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if((rear+1)%size == front){
            return true;
        }
        return false;
    }

    //Enqueue
    public void add(int data){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        if(front == -1){
            front++;
        }
        rear = (rear+1)%size;
        arr[rear] = data;

    }

    //dequeue
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int frontElement = arr[front];
        front = (front+1)%size;
        if(front == rear){
            front =-1;
            rear = -1;
        }
        return frontElement;
    }

    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[front];
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(10);
        queue.add(1);
        queue.add(2);
        queue.add(3);

        queue.remove();

        System.out.println(queue.peek());
    }
}
