package SlidingWindowArrays;

public class MaxSumSubArrayofSizeK {

    int k=3;

    public static void main(String[] args) {
        int[] nums = {1,12,-5,-6,50,3};
        int i=0;
        int j=0;
        int k=4;
        int sum = 0;
        Double max = Double.MIN_VALUE;

        while(j<nums.length) {
            sum+=nums[j];
            if(j-i+1<k) {
                j++;
            } else if(j-i+1==k){
                max=Math.max(max,sum);
                sum=sum-nums[i];
                j++;
                i++;
            }
        }

        System.out.println(max/4.0);
    }
}
