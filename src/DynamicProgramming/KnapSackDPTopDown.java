package DynamicProgramming;

public class KnapSackDPTopDown {

    static int[][] t = new int[5][8];


    public static void main(String[] args) {
        int[] val = {1, 4, 5, 7};
        int[] wt = {1, 3, 4, 5};
        int W=7; //represented by j
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == 0 || j == 0) {
                    t[i][j] = 0;
                }
            }
        }

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 8; j++) {
                if (wt[i - 1] <= j) {
                    t[i][j] = Math.max(val[i - 1] + t[i - 1][j - wt[i - 1]], t[i - 1][j]);
                } else {
                    t[i][j] = t[i-1][j];
                }
            }
        }


        System.out.println("Max profit :" + t[4][7]);
    }




    }

