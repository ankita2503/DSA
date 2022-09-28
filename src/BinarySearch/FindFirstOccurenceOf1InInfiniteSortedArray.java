package BinarySearch;

public class FindFirstOccurenceOf1InInfiniteSortedArray {

    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int k=4;
        int start=0;
        int end =arr.length-1;
        int res = 0;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==k){
                res = mid;
                end = mid-1;
            }
             else{
                if(arr[mid]>k){
                    end=mid-1;
                } else if(arr[mid]<k){
                    start = mid+1;
                    end=end*2;
                }
            }
        }
        System.out.println(res);

    }
}
