package SlidingWindowArrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class findMaxConsecutiveOnes {
    public static void main(String[] args) {
        char[] arr = {1, 0, 1, 1, 0};
        int n = arr.length;
        int start = 0;
        int end = 0;
        int max = Integer.MIN_VALUE;
        int check = 0;
        Map<Integer, Integer> map = new LinkedHashMap();
        while (end < n) {
            int c = arr[end];
            map.put(c, map.getOrDefault(c, 0) + 1);
            if (map.containsKey(0) && map.get(0) > 1) {
                int ch = arr[start];
                while (ch != 0) {
                    start++;
                    ch = arr[start];
                }
                map.put(0, map.get(0) - 1);
                start++;
                max = Integer.max(max, end - start + 1);
            }
                max = Integer.max(max, end - start + 1);
                end++;

        }
        System.out.println(max);
    }
}




