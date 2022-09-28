package BinarySearch;

public class NumberOfTimesSortedArrRotated {

    public static void main(String[] args) {
        int[] arr = {11,12,15,18,21,25,5,6,8};
        int k=4;
        int start=0;
        int end =arr.length-1;
        int result = -1;
        result = BinarySearch(arr, k, start, end);
        System.out.println(arr.length-result);

    }

    private static int BinarySearch(int[] arr, int k, int start, int end) {
        int res = 0;
        int n = arr.length;
        while(start <= end){
            int mid = start +(end - start)/2;

            int prev = arr[(mid+n-1)%n];
            int next = arr[(mid+1)%n];

            if(arr[mid]<=prev && arr[mid]<=next){
                return mid;
            }
             else{
                 //searchg for sorted part condition
                if(arr[start]<=arr[mid]){
                    start =mid+1;
                } else if(arr[end]>=arr[mid]){
                    end = mid-1;
                }
            }
        }
        return res;
    }
}
