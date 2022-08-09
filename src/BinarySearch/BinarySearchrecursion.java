package BinarySearch;

public class BinarySearchrecursion {

    static int[] arr = {1,2,3,4,5,6,7,8,9};

    public static void main(String[] args) {
        int low = 0;
        int high = arr.length-1;
        int val = 11;
        if(arr[0] == val){
            System.out.println("value found at :" + 0);
        } else {
            System.out.println("value found at :" +search(low,high,val));
        }

    }

    public static int search(int low, int high, int val){
        int mid = low + (high-low)/2;
        if(low>high){
            return -1;
        }
        if(arr[mid] == val){
            return mid;
        }
        if(val > arr[mid]){
            return search(mid+1, arr.length-1,val);
        } else {
            return search(0, mid-1, val);
        }
    }
}
