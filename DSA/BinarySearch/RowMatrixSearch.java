import java.util.Arrays;

public class RowMatrixSearch {
    

    public static int [] search(int[][] matrix,int target){

        int row = 0;
        int col = matrix.length-1;

        while (row<matrix.length && col>=0) {
            
            if(matrix[row][col]==target){
                return new int[] {row,col};
            }

            else if(matrix[row][col]>target){
                col--;
            }
            else if(matrix[row][col]<target){
                row++;
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int [][] arr = {
            {10,20,30,40,50},
            {12,22,32,42,52},
            {16,26,36,46,56}
        };
        int target = 36;

        System.out.println(Arrays.toString(search(arr, target)));
    }
}
