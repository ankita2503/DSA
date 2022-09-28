package SlidingWindowArrays;

import java.util.*;

public class lengthOfLongestSubstringKDistinct {
    public static void main(String[] args) {
        String s = "aa";
        int k=1;
        int start = 0;
        int end = 0;
        char[] arr = s.toCharArray();
        int n= arr.length;
        int max = Integer.MIN_VALUE;
        Map<Character,Integer> map = new HashMap();

        while(end<n){
            char c = arr[end];
            map.put(c, map.getOrDefault(c,0)+1);

            if(map.size() > k) {
                max = Math.max(max,end-start);
                char ch= arr[start];
                if(map.get(ch)>1){
                    map.put(ch,map.get(ch)-1);
                } else {
                    map.remove(ch);
                }
                start++;
            }
            max = Math.max(max,end-start+1);
            end++;
        }
        System.out.println(max);
    }
    }




