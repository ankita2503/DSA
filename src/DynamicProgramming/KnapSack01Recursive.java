package DynamicProgramming;

import java.util.Arrays;

public class KnapSack01Recursive {

    static int[][] t = new int[5][8];


    public static void main(String[] args) {
        int[] val = {1, 4, 5, 7};
        int[] wt = {1, 3, 4, 5};

        System.out.println("Max profit :" + knapsack(val, wt, 7, 4));
    }

    public static int knapsack(int[] val, int[] wt, int w, int n) {

        //base condition
        if (n == 0 || w == 0) {
            return 0;
        }

        //choice
        //choose to put the wt in the bag
        // val[n - 1] + knapsack(val, wt, w - wt[n - 1], n - 1)
        // choose not to put the wt in the bag
        // knapsack(val, wt, w, n - 1)
        if (wt[n - 1] <= w) {
            return Math.max(val[n - 1] + knapsack(val, wt, w - wt[n - 1], n - 1), knapsack(val, wt, w, n - 1));
        }

        // not to put the wt in the bag
        else if (wt[n - 1] > w) {
            return knapsack(val, wt, w, n - 1);
        }

        return -1;

    }
}
