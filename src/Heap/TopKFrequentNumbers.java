package Heap;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentNumbers {

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int x = 3;
        int k = 2;
        int j = 0;
        int[] result = new int[k];
        PriorityQueue<int[]> pq = new PriorityQueue(k + 1, (a, b) -> ((int[]) a)[1] - ((int[]) b)[1]);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            Integer key = entry.getKey();
            Integer value = entry.getValue();
            int[] a = new int[2];
            a[0] = key;
            a[1] = value;
            pq.offer(a);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        while (!pq.isEmpty()) {
            result[j++] = pq.poll()[0];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+",");
        }
    }
}

