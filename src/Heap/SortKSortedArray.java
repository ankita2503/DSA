package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class SortKSortedArray {

    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 2, 8, 10, 9};
        int k = 4;
        int j = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            pq.offer(arr[i]);
            if (pq.size() == k) {
                arr[j] = pq.poll();
                j++;
            }
        }
        while (j < arr.length) {
            arr[j] = pq.poll();
            j++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
