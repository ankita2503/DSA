package SlidingWindowArrays;

public class MaxAvgSubArrayofSizeK {

    int k=3;

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int k=4;
        if(nums.length==1){
            System.out.println(Double.valueOf(nums[0]));
        }
        int i=0;
        int j=0;

        int sum = 0;
        long max = Long.MIN_VALUE;
        while(j<nums.length){
            sum = sum + nums[j];
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                max = Math.max(sum,max);
                sum = sum - nums[i];
                i++;
                j++;
            }
        }
        //System.out.print("max:"+max);
        System.out.println(max / 1.0 / k);
    }
}
