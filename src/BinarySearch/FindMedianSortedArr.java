package BinarySearch;

public class FindMedianSortedArr {

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5};
        int[] arr2 = {1};

        int[] nums1 = new int[0];
        int[] nums2 = new int[0];
        if (arr2.length < arr1.length) {

            nums1 = arr2;
            nums2 = arr1;

        }
        int n1 = nums1.length;
        int n2 = nums2.length;
        int start = 0;

        int end = nums1.length;

        double result = 0.0;

        while (start <= end) {
            int cut1 = (start + (end - start) / 2);
            int cut2 = (n1 + n2) / 2 - cut1;

            int l1 = (cut1 == 0) ? Integer.MIN_VALUE : nums1[cut1 - 1];
            int l2 = (cut2 == 0) ? Integer.MIN_VALUE : nums2[cut2 - 1];
            int r1 = (cut1 == n1) ? Integer.MAX_VALUE : nums1[cut1];
            int r2 = (cut2 == n2) ? Integer.MAX_VALUE : nums2[cut2];


            if (l1 > r2) {
                end = cut1 - 1;
            } else if (l2 > r1) {
                start = cut1 + 1;
            } else {
                if ((n1 + n2) % 2 == 0) {
                    result = (Math.max(l1, l2) + Math.min(r1, r2)) / 2.0;
                    break;
                } else {
                    result = Math.min(r1, r2);
                    break;
                }
            }
        }
        System.out.println(result);
    }
}
