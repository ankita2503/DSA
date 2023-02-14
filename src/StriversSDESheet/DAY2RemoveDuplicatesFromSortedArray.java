package StriversSDESheet;

public class DAY2RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int j = 1;
        int i = 0;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
            }
        }
        int index = i + 1;
        for (int k = 0; k < index; k++) {
            System.out.print(nums[k] + ",");
        }
    }
}

