package DynamicProgramming;

public class subsetRecursive {

    static int[][] t = new int[5][8];


    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 8, 10};
        int sum = 110;

        System.out.println("Max profit :" + knapsack(arr, sum, arr.length));
    }

    public static boolean knapsack(int[] arr, int sum, int n) {

        //base condition
        if (n == 0 || sum == 0) {
            return true;
        }

        //choice
        //choose to put the wt in the bag
        // val[n - 1] + knapsack(val, wt, w - wt[n - 1], n - 1)
        // choose not to put the wt in the bag
        // knapsack(val, wt, w, n - 1)
        if (arr[n - 1] <= sum) {
            return knapsack(arr, sum-arr[n-1], n - 1) || knapsack(arr, sum, n - 1);
        }

        // not to put the wt in the bag
        else  {
            return knapsack(arr, sum, n - 1);
        }



    }
}
