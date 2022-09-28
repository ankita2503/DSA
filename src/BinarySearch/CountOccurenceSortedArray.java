package BinarySearch;

public class CountOccurenceSortedArray {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,4,4,4,4};
        int k=4;
        int start=0;
        int end =arr.length-1;
        int startResult = 0;
        int endResult = 0;
        startResult = BinarySearch(arr, k, start, end,0);
        endResult = BinarySearch(arr, k, start, end,1);
        System.out.println(endResult-startResult+1);

    }

    private static int BinarySearch(int[] arr, int k, int start, int end, int flag) {
        int res = 0;
        while(start <= end){
            int mid = start +(end - start)/2;
            if(arr[mid]== k){
                res = mid;
                if(flag==0){
                    end = mid-1;
                }
                if(flag==1){
                    start = mid+1;
                }

            }
             else{
                if(arr[mid]>= k){
                    end =mid-1;
                } else if(arr[mid]< k){
                    start = mid+1;
                }
            }
        }
        return res;
    }
}
