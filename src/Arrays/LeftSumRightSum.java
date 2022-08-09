package Arrays;

import java.util.Arrays;

public class LeftSumRightSum {

    public static void main(String[] args) {

        int [] boxes = {0,0,1,0,1,1};
        int left = 0, right = 0, lsum = 0, rsum = 0, len = boxes.length;
        for (int i = 0; i < len; i++) {
            if (boxes[i]== 1) {
                right++;
                rsum += i;
            }
        }

        int[] ans = new int[len];

        for (int i = 0; i < len; i++) {
            ans[i] = lsum + rsum;
            if (boxes[i] == 1) {
                left++;
                right--;
            }
            lsum = lsum + left;
            rsum = rsum - right;
        }



        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }
    }
