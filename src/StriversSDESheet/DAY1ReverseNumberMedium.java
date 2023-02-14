package StriversSDESheet;

public class DAY1ReverseNumberMedium {

    public static void main(String[] args) {
        int x = -123;
        int rev = 0;
        while (x != 0) {
            int rem = x % 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                System.out.println("0");
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && rem < -8)){
                System.out.println("0");
            }
            rev = rev * 10 + rem;
            x = x / 10;

        }
        System.out.println(rev);
    }
}
