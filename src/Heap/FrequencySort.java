package Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int j = 0;
        int[] result = new int[arr.length];

        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((x,y) -> map.get(x) == map.get(y) ? y-x:map.get(x) - map.get(y));
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i = 0; i < arr.length; i++) {
            pq.offer(arr[i]);
        }

        int currentIndex = 0;
        while(!pq.isEmpty()){
            result[currentIndex++] = pq.poll();
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+",");
        }
    }
}

