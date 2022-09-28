package BinarySearch;

import java.util.Collections;
import java.util.PriorityQueue;

public class TimesSortedArrayIsRotated {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};

int j=1;
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<6;i++){
            pq.add(i);
        //    pq.add(j++);
        }
        while(!pq.isEmpty()){
            System.out.print(pq.poll()+",");
        }

        System.out.println();
        PriorityQueue<Integer> pq1 = new PriorityQueue<>(10, Collections.reverseOrder());
        for(int i=0;i<6;i++){
            pq1.add(i);
            pq1.add(1);
        }
        while(!pq1.isEmpty()){
            System.out.print(pq1.poll()+",");
        }

        System.out.println();

        int start = 0;
        int n = arr.length;
        int end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            System.out.println(start);
        }
    }
}
