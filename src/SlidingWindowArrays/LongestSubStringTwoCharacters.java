package SlidingWindowArrays;

import java.util.*;

public class LongestSubStringTwoCharacters {

    public static void main(String[] args) {
        String s = "ccaabbb";
        char[] arr = s.toCharArray();
        int n = arr.length;
        int start = 0;
        int end = 0;
        int max = Integer.MIN_VALUE;

        Map<Character, Integer> map = new LinkedHashMap();

        while (end < n) {
            char c = arr[end];
            if (map.size() <= 2) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }

            }
            while (map.size() > 2) {
                max = Math.max(max, end - start + 1);
                if (map.get(arr[start]) > 1) {
                    map.put(arr[start], map.get(arr[start]) - 1);
                } else {
                    map.remove(arr[start]);
                }
                start++;
            }
            end++;
        }
        System.out.println(max);
    }
}




