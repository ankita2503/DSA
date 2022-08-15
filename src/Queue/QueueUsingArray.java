package Queue;

public class QueueUsingArray {

    int [] arr;
    int size;
    int rear = -1;

    public  QueueUsingArray(int size){
        arr = new int[size];
        this.size = size;
    }


    public boolean isEmpty(){
        if(rear == -1){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(rear == size){
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

        rear++;
        arr[rear] = data;
    }

    //dequeue
    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int frontElement = arr[0];
        int j=1;
        while(j<rear){
            arr[j-1] = arr[j];
            j++;
        }
        rear--;
        return frontElement;
    }

    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }

        return arr[0];
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
