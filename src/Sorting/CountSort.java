package Sorting;

import java.util.Arrays;

public class CountSort {

    public static void main(String[] args) {
        int [] nums = {8,1,2,2,3};
        int [] result = new int[nums.length];
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max = nums[i];
            }
        }

        int [] newArr = new int[max+1];
        Arrays.fill(newArr,0);

        for(int i=0;i<nums.length;i++){
            newArr[nums[i]] = newArr[nums[i]]+1;
        }

        for(int i=0;i<newArr.length;i++){
            if(newArr[i]!=0){
                sum = sum + newArr[i];
                newArr[i] = sum;
            }
        }

        for(int i=0;i<nums.length;i++){
            result[--newArr[nums[i]]] = nums[i];
        }

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+",");
        }
    }
}
