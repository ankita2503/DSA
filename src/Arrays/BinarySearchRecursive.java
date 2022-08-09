package Arrays;

public class BinarySearchRecursive {

    static int [] nums = {10,20,30,40,50,60,70,80,90};
    static int n = 10;
    public static void main(String [] args){
        System.out.println(findNumber(0,nums.length-1));
    }

    public static int findNumber(int low, int high){
        while(high>=low){
            int mid = low+(high-low)/2;
            if(nums[mid]==n){
                return mid;
            }
            if(n>nums[mid]){
                return findNumber(mid+1,nums.length-1);
            } else {
                return findNumber(0,mid);
            }
        }
        return -1;
    }
    }

