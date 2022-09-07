package SlidingWindowArrays;

import java.util.ArrayList;
import java.util.List;

public class dietPlanPerformance {

    public static void main(String[] args) {
        int[] arr = {3,2};
        int k = 2;
        int lower = 0;
        int upper = 1;
        int n = arr.length;
        Integer result = findAllMax(arr, n, k, lower, upper);
        System.out.println(result);
    }

    public static Integer findAllMax(int[] arr, int n, int k, int upper, int lower) {
        int start = 0;
        int end = 0;
        int sum = 0;
        int result = 0;
        while (end < n) {
            sum += arr[end];
            if (end - start + 1 == k) {
                if (sum < lower) {
                    result = result-1;
                } else if(sum > upper) {
                    result = result+1;
                }
                sum = sum-arr[start];
                start++;
            }
            end++;

        }
        return result;
    }
}
