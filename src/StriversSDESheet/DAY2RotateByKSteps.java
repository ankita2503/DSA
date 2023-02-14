package StriversSDESheet;

import java.util.Arrays;

public class DAY2RotateByKSteps {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        rotate(nums, k);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + ",");
        }
    }

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[nums.length];
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }


    //With Extra space O(n) both space and time
    /*public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[nums.length];

        for(int i=0;i<nums.length;i++){
            result[(i+k)%n] = nums[i];
        }

        for(int i=0;i<result.length;i++){
            nums[i] = result[i];
        }
    }*/


    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

