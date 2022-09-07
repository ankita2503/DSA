package SlidingWindowArrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStringWithoutRepeating {

    public static void main(String[] args) {
        String s = "pwwkew";
        char[] arr = s.toCharArray();
        int n = arr.length;
        int start = 0;
        int end = 0;
        int max = Integer.MIN_VALUE;

        Map<Character, Integer> map = new LinkedHashMap();

        while (end < n) {
            char c = arr[end];
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
            while (map.size() < end-start+1) {
                char ch = arr[start];
                if (map.get(ch)>1) {
                    map.put(ch, map.get(ch)-1);
                } else {
                    map.remove(ch);
                }
                start++;
            }
            max = Math.max(max,map.size());
            end++;
        }
        System.out.println(max);
    }
}




