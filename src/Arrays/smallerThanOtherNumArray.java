package Arrays;

import java.beans.PropertyEditorSupport;
import java.util.Arrays;

public class smallerThanOtherNumArray {

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
            sum = sum + newArr[i];
            newArr[i] = sum - newArr[i];
        }

        for(int i=0;i<nums.length;i++){
            result[i] = newArr[nums[i]];
        }

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+",");
        }
    }
}
