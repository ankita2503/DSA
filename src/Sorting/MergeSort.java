package Sorting;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {19,8,-13,2,-5,4,100,30};
        merge(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    public static void merge(int[] nums, int si, int ei) {
        int mid = si + (ei - si) / 2;
        if (si >= ei) {
            return;
        }
        merge(nums, si, mid);
        merge(nums, mid + 1, ei);
        conquer(nums, si, mid, ei);


    }

    public static void conquer(int[] nums, int si, int mid, int ei) {
        int[] merged = new int[ei - si + 1];
        int index1 = si;
        int index2 = mid + 1;
        int x = 0;

        while (index1 <= mid && index2 <= ei) {
            if (nums[index1] <= nums[index2]) {
                merged[x++] = nums[index1++];
            } else {
                merged[x++] = nums[index2++];
            }

        }

        while (index1 <= mid) {
            merged[x++] = nums[index1++];
        }

        while (index2 <= ei) {
            merged[x++] = nums[index2++];
        }


        for (int i = 0, j = si; i < merged.length; i++, j++) {
            nums[j] = merged[i];

        }

    }
}
