package Sorting;

public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3,6,1,2,7,8,9,3,4,5,10};
        quickSort(arr,0,arr.length-1);
        for(int j=0;j<arr.length;j++) {
            System.out.print(arr[j] + ",");
        }
        }

    public static void quickSort(int[] arr, int low, int high){
        if(low<high){
            int pivotIndex = partition(arr, low, high);
            quickSort(arr,low,pivotIndex-1);
            quickSort(arr,pivotIndex+1,high);
        }
    }
    public static int partition(int[] arr, int low, int high){
       int i=low-1;
       int pivot = arr[high];

       for(int j=low;j<high;j++){
           if(arr[j]<pivot){
               i++;
               int temp = arr[j];
               arr[j] = arr[i];
               arr[i] =temp;
           }
       }
       i++;
       int temp = arr[i];
        arr[i] = arr[high];
        arr[high]  = temp;
       return i;
    }
}
