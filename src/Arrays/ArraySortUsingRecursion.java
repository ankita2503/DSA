package Arrays;

public class ArraySortUsingRecursion {

    public static void main(String[] args) {

        int[] arr = {2, 3, 7, 6, 4, 5, 9};
        sort(arr,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }


    public static int[] sort(int[] arr, int n) {

        if (n == 0) {
            return null;
        }
        return sort(getSorted(arr,n), n - 1);
    }

    public static int[] getSorted(int[] arr,int n) {
        int max = Integer.MIN_VALUE;
        int j = n;
        for (int i = 0; i <=n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                j=i;
            }
        }

        int temp  =arr[j];
        arr[j] = arr[n];
        arr[n] = temp;
        return arr;
    }
}
