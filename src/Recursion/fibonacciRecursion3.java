package Recursion;

public class fibonacciRecursion3 {

    public static void main(String[] args) {

        System.out.print(0+",");
        System.out.print(1+",");
        fibo(6);
    }

    public static int fibo(int n){
        if(n<2){
            return n;
        }
        int ans = fibo(n-1) + fibo(n-2);
        System.out.print(ans+",");
        return ans;
    }


}
