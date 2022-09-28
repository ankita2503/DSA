package BinarySearch;

public class FindElementSortedArrRotated {

    public static void main(String[] args) {
        int[] arr = {11,12,15,18,21,25,5,6,8};
        int k=5;
        int start=0;
        int end =arr.length-1;
        int index = -1;
        index = findIndex(arr, k, start, end);
        if(arr[index]==k){
            System.out.println(index);
        } else {
            int element = binarySearch(arr, k, start, index-1);
            if(element == -1){
                element = binarySearch(arr, k, index+1, end);
            }
            System.out.println(element);
        }


    }

    private static int findIndex(int[] arr, int k, int start, int end) {
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
                 //searching for sorted part condition
                if(arr[start]<=arr[mid]){
                    start =mid+1;
                } else if(arr[end]>=arr[mid]){
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int k, int start, int end) {
        int res = 0;
        int n = arr.length;
        while(start <= end){
            int mid = start +(end - start)/2;



            if(arr[mid]==k){
                return mid;
            }
            else{
                //searching for sorted part condition
                if(arr[mid]<k){
                    start =mid+1;
                } else if(arr[mid]>k){
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
