package Matrix;

import java.util.HashSet;
import java.util.Set;

public class SearchInMatrixBinarySearchII {

    // complexity log(n*m)
    public static void main(String[] args) {

        int k=1;
        int[][] matrix = new int[4][4];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=k++;
            }
        }

        System.out.println(searchMatrix(matrix,8));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0){
            return false;
        }
        int n = matrix[0].length;
        int start = 0;
        int end=(matrix.length-1)*(matrix[0].length-1);
        int pivotElement = 0;
        int pivotIndex= 0;
        while(start<=end){
            pivotIndex = start +(end-start)/2;
            pivotElement = matrix[pivotIndex/n][pivotIndex%n];
            if(pivotElement==target){
                return true;
            }
            else if(pivotElement<target){
                start = pivotElement+1;
            } else {
                end = pivotElement-1;
            }
        }
        return false;
    }
}
