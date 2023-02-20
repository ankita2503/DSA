package Arrays;

import java.util.HashSet;

public class ReverseCharArray {


    public static void main(String[] args) {
        char[] arr = {'a','b','c','d'};

        int l = arr.length-1;
        int n=arr.length/2;
        for(int i=0;i<=n/2;i++){

            char temp = arr[i];
            arr[i] = arr[l];
            arr[l] = temp;

            l--;

        }

        System.out.println(String.valueOf(arr));

    }

}
