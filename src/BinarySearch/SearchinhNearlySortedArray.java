package BinarySearch;

public class SearchinhNearlySortedArray {

    public static void main(String[] args) {
        int[] arr = {5,10,30,20,40};
        int k=1;
        int start=0;
        int end =arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;

            if(arr[mid]==k){
                System.out.println(mid);
                break;
            }
            else if(mid-1>=start &&  arr[mid-1]==k){
                System.out.println(mid-1);
                break;
            }
            else if(mid+1<=end && arr[mid+1]==k){
                System.out.println(mid+1);
                break;
            } else{
                if(mid-1>=start && k<arr[mid-1]){
                    end=mid-2;
                } else if(mid+1<=end && k>arr[mid+1]){
                    start = mid+2;
                }
            }
        }


    }
}
