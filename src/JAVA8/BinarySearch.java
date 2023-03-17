package JAVA8;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6};
        int d = 5;
        int n = arr.length;
        int l = 0;
        int h = n;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (arr[m] == d) {
                System.out.println("elelemt found at index :" + m);
                return;
            } else if (arr[m] > d) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
    }
}
