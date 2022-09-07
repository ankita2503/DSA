package SlidingWindowArrays;

import java.util.ArrayList;
import java.util.List;

public class AllMaxInSubArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,5,6,8,2,1};
        int k=3;
        int n = arr.length;
        List<Integer> list = findAllMax(arr,n,k);
        list.forEach(System.out::print);
    }

    public static List<Integer> findAllMax(int[] arr, int n, int k){

        int start = 0;
        int end = 0;
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList();


        while(end<n){
            if(max<arr[end]){
                max = arr[end];
            }

            if(end-start+1 == k){
                list.add(max);
                start++;
            }
            end++;

        }
        return list;
    }
}
