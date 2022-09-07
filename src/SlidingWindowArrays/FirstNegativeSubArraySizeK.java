package SlidingWindowArrays;

import java.util.ArrayList;

public class FirstNegativeSubArraySizeK {

    public static void main(String[] args) {

        int[] arr = {-8, 2, 3, -6, 10};
        int start = 0;
        int end = 0;
        int k = 2;


        ArrayList<Integer> list = new ArrayList<Integer>();

        while (end < arr.length) {
//            if given number is negative then add it into given list
            if (arr[end] < 0) {
                list.add(arr[end]);
            }

            if ((end - start + 1) < k) {
                end++;
            } else if ((end - start + 1) == k) {
//                IF list is empty then print zero
                if (list.size() == 0) {
                    System.out.println(0);
                } else {
                    if (arr[start] == list.get(0)) {
                        System.out.println(arr[start]);
                        list.remove(list.get(0));
                    } else {
                        System.out.println(list.get(0));
                    }
                }

                start++;
                end++;
            }

        }
    }
}
