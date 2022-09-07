package SlidingWindowArrays;

public class divisorSubString {

    public static void main(String[] args) {
        int num = 240;
        int k = 2;
        System.out.println(divisorSubstrings(num, k));
    }

    /*public static int divisorSubstrings(int num, int k) {
        int count = 0;
        char[] arr = String.valueOf(num).toCharArray();
        int n = arr.length;
        int start = 0;
        int end = 0;
        int result = 0;
        int div = (int) Math.pow(10, k - 1);
        while (end < n) {
            int rem = Character.getNumericValue(arr[end]);
            result = (result * 10) + rem;
            if (end - start + 1 == k) {
                if (result != 0 && num % result == 0) {
                    count++;
                }
                result = result % div;
                start++;
            }
            end++;
        }
        return count;
    }*/

    public static int divisorSubstrings(int num, int k) {
        int count = 0;
        int pow = (int) Math.pow(10, k);
        for (int n = num; n > 0; n=n/10) {
            int div = n % pow;
            if (div != 0 && num % div == 0){
                count++;
            }
            if (n / pow == 0){
                break;
            }
        }
        return count;
    }
}
