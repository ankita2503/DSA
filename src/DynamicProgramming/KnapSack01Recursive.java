package DynamicProgramming;

import java.util.Arrays;

public class KnapSack01Recursive {

    static int[][] t = new int[5][8];


    public static void main(String[] args) {
        int[] val = {1, 4, 5, 7};
        int[] wt = {1, 3, 4, 5};
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                t[i][j] = -1;
            }
        }
        System.out.println("Max profit :" + knapsack(val, wt, 7, 4));
    }

    public static int knapsack(int[] val, int[] wt, int w, int n) {

        if (w == 0 || n == 0) {
            return 0;
        }

        if (t[n][w] != -1) {
            return t[n][w];
        }

        if (wt[n - 1] <= w) {
            return t[n][w] = Math.max(val[n - 1] + knapsack(val, wt, w - wt[n - 1], n - 1),
                    knapsack(val, wt, w, n - 1));
        } else {
            return t[n][w] = knapsack(val, wt, w, n - 1);
        }


    }
}
