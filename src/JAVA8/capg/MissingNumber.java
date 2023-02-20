package JAVA8.capg;

public class MissingNumber {


    public static void main(String[] args) {
        int[] arr = new int[]{0,2,3,4,5,6,7,8,9};

        int sum = 0;
        int n1 = arr.length;
        int total = n1*(n1+1)/2;
        for(int i=0;i<arr.length;i++) {


            sum += arr[i];
        }

        System.out.println(total - sum);


    String str = "This is java this is java";

    char[] charArr = str.toLowerCase().toCharArray();

    int n = str.length();

    for(int i=0;i<n/2;i++){
        if(str.charAt(i)!=' '){
            char c = charArr[i];
            charArr[i] = (char)(c - 32) ;
        }

    }





        for(int i=0;i<charArr.length;i++){
            System.out.print(charArr[i]);
        }
    }
}



