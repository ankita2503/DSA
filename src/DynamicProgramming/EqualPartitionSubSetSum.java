package DynamicProgramming;

public class EqualPartitionSubSetSum {




    public static void main(String[] args) {
        int[] nums = {1,5,11,5};
        System.out.println("result :" + canPartition(nums));
    }

    public static boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
        }
        if(sum%2!=0){
            return false;
        }
        int w=(sum/2)+1;
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
        return t[N-1][w-1];
    }
}
