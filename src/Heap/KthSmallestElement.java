package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallestElement {

    public static void main(String[] args) {
        int[] arr = {3,1,5,8,3,2,0};
        int k=3;

        PriorityQueue<Integer> pq = new PriorityQueue<>(arr.length, Collections.reverseOrder());

        for(int i=0;i<arr.length;i++){
            pq.offer(arr[i]);
            if(pq.size()>k){
                pq.poll();
            }



        }

        System.out.println(pq.peek());

    }



}
