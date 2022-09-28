package Heap;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KClosestElements {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int x = 3;
        int k = 4;
        PriorityQueue<int[]> pq = new PriorityQueue(arr.length, (a, b) -> ((int[]) a)[1] - ((int[]) b)[1]);
        for (int i = 0; i < arr.length; i++) {
            int[] a = new int[2];
            if (!pq.isEmpty()) {
                int diff = Math.abs(x - pq.peek()[0]);
                a[0] = Math.abs(x - arr[i]);
                a[1] = arr[i];
                if (diff >= a[0] && arr[i] >= pq.peek()[1]) {
                    pq.add(a);
                }
                if (pq.size() > k) {
                    pq.poll();
                }
            } else {
                int[] a1 = new int[2];
                a1[0] = Math.abs(x - arr[i]);
                a1[1] = arr[i];
                pq.add(a1);
            }
        }
        while (!pq.isEmpty()) {
            System.out.print(pq.poll()[1] + ",");
        }
    }
}
