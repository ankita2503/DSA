package Recursion;

public class RecursionWithrecursion {
    static int i=0;
    public static void main(String[] args) {

        System.out.println("Final I value" + message());

    }

    public static int message(){
        message1();
        System.out.println(++i);
        return i;

    }

    public static int message1(){
        message2();
        System.out.println(++i);
        return i;

    }

    public static int message2(){
        message3();
        System.out.println(++i);
        return i;

    }

    public static int message3(){
        message4();
        System.out.println(++i);
        return i;

    }

    public static int message4(){
        System.out.println(++i);
        return i;
    }
}
