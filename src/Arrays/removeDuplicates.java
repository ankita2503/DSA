package Arrays;

import java.util.Arrays;

public class removeDuplicates {

    public static void main(String[] args){
        int[] arr = {3,2,5,7,8,8,6,4,5,3,2,4,5,5};

        Arrays.sort(arr);

        int i=0;
        int j=1;
        int temp = 0;



        while(j<arr.length){
            if(arr[i]==arr[j]){
                j++;
            } else {
                i++;
                arr[i]=arr[j];
            }
        }



        for(int k=i+1;k<arr.length;k++){
            arr[k]=0;
        }

        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+",");
        }
    }
}
