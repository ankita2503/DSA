package Arrays;

public class fibonacciRecursion {

    private static int n=10;

    public static void main(String ... args){
      int a=0;
      int b=1;
      int c = a+b;
      int i=8;
      int sum =1;

       System.out.println(fibo(a,b,c,i,sum));

    }

    public static int fibo(int a, int b, int c,int i,int sum ) {
        if(i==0){
            return 0;
        }
        i=i-1;
        fibo(b,c, a+b, i,sum);
        return sum;
    }
}
