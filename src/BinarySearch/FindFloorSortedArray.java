package BinarySearch;

public class FindFloorSortedArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,10,10,12,19};
        int k=5;
        int start=0;
        int end =arr.length-1;
        int res = 0;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==k){
                res = mid;
                break;
            }
             else{
                if(arr[mid]>k){
                    res = mid; //ceil
                    end=mid-1;
                } else if(arr[mid]<k){
                    //res = mid;  //floor
                    start = mid+1;
                }
            }
        }
        System.out.println(arr[res]);

    }
}
