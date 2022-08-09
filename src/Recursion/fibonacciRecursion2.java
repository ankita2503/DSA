package Recursion;

public class fibonacciRecursion2 {

    public static void main(String[] args) {
        System.out.println(fibo(6));
    }

    public static int fibo(int n){
        if(n<2){
            System.out.print(n);
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
