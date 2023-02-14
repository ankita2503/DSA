package DynamicProgramming;

public class TargetSumDP {




    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int diff = 3;
        int total = 0;
        for(int i=0;i<nums.length;i++){
            total+=nums[i];
        }

        //s1+s2 = total;
        //s1-s2=diff;
        int sum = (total - diff)/2; //sum of one subset

        System.out.println("result :" + subset(nums,sum));
    }

    public static int subset(int[] nums, int sum) {

        int n = nums.length;

        int w = sum + 1;
        int N = n + 1;
        int[][] t = new int[N][w];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0) {
                    t[i][j] = 0;
                }
                if (j == 0) {
                    t[i][j] = 1;
                }
            }
        }
        for (int i = 1; i < N; i++) {
            for (int j = 0; j < w; j++) {
                if (nums[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - nums[i - 1]] + t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[N - 1][w - 1];
    }
}
