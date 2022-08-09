package Arrays;

public class printXPowN {
    public static void main(String ... args){
        System.out.println(calculate(2,5));
    }

    public static int calculate(int n, int i){
        if(i==0){
            return 1;
        }
//        stack height n
        i=i-1;
        int result =1;
        result =  calculate(n,i/2) * calculate(n,i/2);
        return result;
//        Stack height logn
        /*int result =1;
        if(i%2==0){
            result =  calculate(n,i/2) * calculate(n,i/2);
        } else {
            result =  calculate(n,i/2) * calculate(n,i/2) *n;
        }*/
    }
}
