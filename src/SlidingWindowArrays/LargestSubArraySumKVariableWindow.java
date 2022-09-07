package SlidingWindowArrays;

import java.util.ArrayList;
import java.util.List;

public class LargestSubArraySumKVariableWindow {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 11;
        int n = arr.length;
        System.out.println(findLargestSubArray(arr, n, sum));
    }

    public static Integer findLargestSubArray(int[] arr, int n, int target) {
        int start = 0;
        int end = 0;
        int min = Integer.MAX_VALUE;
        long sum = 0l;
        int count = 0;
        while (end < n) {
            sum += arr[end];
            if (sum == target) {
                count = end - start + 1;
                count = Math.min(min, count);
                sum = sum - arr[start];
                start++;
            }
            while(sum>target){
                count = end - start + 1;
                count = Math.min(min, count);
                sum = sum - arr[start];
                start++;
            }
            end++;
        }
        return count;
    }
}
