package Arrays;

public class CheckArrayStrictIncByRecursion {

    private static boolean result = true;

    public static void main(String... args) {
        int[] arr = {1, 2, 3, 3, 5, 6};
        check(arr, 0);
        System.out.println(result);
    }

    public static boolean check(int[] arr, int i) {
        if (i == arr.length-1) {
            return result;
        }
        if (arr[i] >= arr[i + 1]) {
            result = false;
        } else {
            check(arr, i + 1);
        }
        return result;
    }
}
