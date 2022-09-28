package Heap;

import java.util.*;
import java.util.stream.Collectors;

public class ConnectSticks {

    public  void main(String[] args) {
        List<Object> list = new ArrayList();
        int[] arr = {1,8,3,5};
        int sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0;i<arr.length;i++){
            pq.offer(arr[i]);
            list = Arrays.asList(pq.toArray());
            List<Integer> integers = list.stream()
                    //.flatMap(Collection::stream)
                    .map(ob->(Integer)ob)
                    .collect(Collectors.toList());
        }

        while(!pq.isEmpty() && pq.size()>=2){
            int a = pq.poll();
            int b = pq.poll();
            sum += a+b;
            pq.offer(a+b);
        }

        System.out.println(sum);
    }
}