package Queue;

public class MyCircularDeque {
    int[] buffer;
    int k;
    int front;
    int rear;
    int cnt;

    public MyCircularDeque(int k) {
        buffer = new int[k];
        this.k = k;
        front = k - 1;
        rear = 0;
        cnt = 0;
    }

    boolean insertFront(int value) {
        if (isFull())
            return false;
        buffer[front] = value;
        front = (front - 1 + k) % k;
        cnt++;
        return true;
    }

    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    boolean insertLast(int value) {
        if (isFull())
            return false;
        buffer[rear] = value;
        rear = (rear + 1) % k;
        cnt++;
        return true;
    }

    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    boolean deleteFront() {
        if (isEmpty())
            return false;
        front = (front + 1) % k;
        cnt--;
        return true;
    }

    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    boolean deleteLast() {
        if (isEmpty())
            return false;
        rear = (rear - 1 + k) % k;
        cnt--;
        return true;
    }

    /** Get the front item from the deque. */
    int getFront() {
        if (isEmpty())
            return -1;
        return buffer[(front + 1) % k];
    }

    /** Get the last item from the deque. */
    int getRear() {
        if (isEmpty())
            return -1;
        return buffer[(rear - 1 + k) % k];
    }

    /** Checks whether the circular deque is empty or not. */
    boolean isEmpty() {
        return cnt == 0;
    }

    /** Checks whether the circular deque is full or not. */
    boolean isFull() {
        return cnt == k;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */