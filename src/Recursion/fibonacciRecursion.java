package Recursion;

public class fibonacciRecursion {

    public static void main(String[] args) {
        int a = 0;
        int b= 1;
        int n=6;
        System.out.print(a);
        System.out.print(",");
        System.out.print(b);
        System.out.print(",");
        printFibo(a,b,n-2);
    }

    public static void printFibo(int a, int b, int n){

        if(n==0){
            return;
        }
        int c = a + b;
        System.out.print(c);
        System.out.print(",");

        printFibo(b, c, n-1);

    }
}
