package SlidingWindowArrays;

import java.util.HashMap;
import java.util.Map;

public class longestSubstring {
    public static void main(String[] args) {
        String s = "aaabb";
        int k=3;
        int start = 0;
        int end = 0;
        char[] arr = s.toCharArray();
        int n= arr.length;
        int max = Integer.MIN_VALUE;
        Map<Character,Integer> map = new HashMap();
        int count=0;
        int sum=0;

        while(end<n){
            char c = arr[end];
            map.put(c, map.getOrDefault(c,0)+1);

            for (Character key: map.keySet()){
                sum += map.get(key);
            }

            if(sum%k ==0){
                count++;

                char ch = arr[start];
                if(map.get(ch)>1){
                    map.put(ch,map.get(ch)-1);
                } else {
                    map.remove(ch);
                }
                start++;
            }
sum=0;
            end++;
        }
        System.out.println(count);
    }
    }




