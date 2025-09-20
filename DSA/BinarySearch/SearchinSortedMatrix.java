import java.util.Arrays;

public class SearchinSortedMatrix {

    public static int[] findFirstandLastIndex(int[][] matrix,int target){
        int row = 0;
        int col = matrix.length-1;
        while(row<matrix.length){
            if( matrix[row][0]<=target && target<=matrix[row][matrix.length-1]){
                return new int[]{row,matrix.length};
            }
            else{
                row++;
            }
        }
        return new int[]{-1,-1};
    }
    
    public static void main(String[] args) {
        
        int[][] matrix = {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,14,20},
            {23,34,53,63}
        };

        int target = 23;

        System.out.println(Arrays.toString(findFirstandLastIndex(matrix, target)));
    }

}
