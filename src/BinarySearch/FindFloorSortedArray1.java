package BinarySearch;

public class FindFloorSortedArray1 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,8,10,10,12,19};
        int k=5;
        int start=0;
        int end =arr.length-1;
        int res = 0;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]==k){
                System.out.println(mid);//ans
                break;
            }
                if(arr[mid]>k){
                    end=mid-1;
                } else if(arr[mid]<k){
                    start = mid+1;
                }
            }

        System.out.println(arr[start]);//floor\
        System.out.println(arr[end]);//ceil

    }
}
