package DynamicProgramming;

public class MinimumSubSetSumDiff {




    public static void main(String[] args) {
        int[] nums = {1,6,11,5};
        System.out.println("result :" + canPartition(nums));
    }

    public static int canPartition(int[] nums) {
        int n = nums.length;
        int range = 0;
        for(int i=0;i<n;i++){
            range+=nums[i];
        }

        int w=range+1;
        int N = n+1;
        boolean[][] t = new boolean[N][w];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < w; j++) {
                if (i == 0) {
                    t[i][j] = false;
                }
                if (j == 0) {
                    t[i][j] = true;
                }
            }
        }
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < w; j++) {
                if (nums[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - nums[i - 1]] || t[i - 1][j];
                } else {
                    t[i][j] = t[i-1][j];
                }
            }
        }

        int result = Integer.MAX_VALUE;

        for(int j=0;j<w/2;j++){
            if(t[n-1][j]==true){
                int temp = range - 2*j;
                result = Math.min(result,temp);
            }
        }
        return result;
    }
}
