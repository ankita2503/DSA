package Matrix;

public class SearchInMatrixBinarySearch {

    // complexity log(n)+log(m)
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
        int top = 0;
        int down = matrix.length-1;
        int col = matrix[0].length-1;
        while(top<=down){
            int mid = top+(down-top)/2;
            if(matrix[mid][0]<=target && matrix[mid][col]>=target){
                return binarySearch(matrix,mid,target);
            } else if(matrix[mid][0]>target){
                down = mid-1;
            } else if(matrix[mid][col]<target){
                top = mid+1;
            }
        }
        return false;
    }

    public static boolean binarySearch(int[][] matrix, int rowIndex, int target){
        int start = 0;
        int end = matrix[0].length-1;

        while(start<=end){
            int mid = start+(end-start)/2;

            if(matrix[rowIndex][mid]==target){
                return true;
            } else if(matrix[rowIndex][mid]>target){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return false;
    }
}
