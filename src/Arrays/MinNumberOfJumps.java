package Arrays;

public class MinNumberOfJumps {
    public static void main(String[] args) {

        int[] arr = {2, 3, 1, 1, 4};
        int n = arr[0];
        int max = Integer.MIN_VALUE;
        int j = 1;
        int count =0;
        while (j < n) {
            if (max < arr[j]) {
                max = arr[j];
                j++;
                count++;
            }

            if(n<arr.length-1){
                j=n+max-1;
                n=arr[j]+1;
            }

        }

        System.out.println(count);
    }
}

