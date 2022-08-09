package Sorting;

import java.util.Arrays;

public class RadixSort {

    public static void main(String[] args) {
        int [] nums = {432,8,530,90,88,231,11,45,677,199};
        int [] result = new int[nums.length];
        int max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }

        for(int pos=1;max/pos>0; pos=pos*10) {
            int[] newArr = new int[10];
            Arrays.fill(newArr, 0);

            for (int i = 0; i < nums.length; i++) {
                newArr[(nums[i]/pos)%10]++;
            }

            for (int i = 1; i < 10; i++) {
                    newArr[i]+=newArr[i-1];
            }

            for (int i = nums.length-1; i >=0; i--) {
                result[--newArr[(nums[i]/pos)%10]] = nums[i];

            }

            for (int i = 0; i < nums.length; i++)
                nums[i] = result[i];
        }

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+",");
        }
    }
}
