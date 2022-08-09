package Arrays;

public class SortArraysWith0and1and2s {
    public static void main(String [] args){
        int [] arr = {2,0,1,0,2,0,1,2,0,0,1,1,1,2};
        int temp=0;

       int i=0;
       int j=1;

       while(j<arr.length-1){
           if(arr[i]>arr[j]){
               temp = arr[i];
               arr[i]=arr[j];
               arr[j]=temp;
               i++;
               j++;
           }
           if(arr[i]==arr[j]){
               j++;
           }
           if(arr[i]<arr[j]){
               i++;
               j++;
           }

       }

        temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

        System.out.println(i);
        System.out.println(j);
       for(int k=0;k<arr.length;k++){
           System.out.print(arr[k]);
       }

    }
    }

