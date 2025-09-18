package DSA;

import java.util.Arrays;

public class SearchElementIn2DArray {

    public static int[] findElementIn2DArray(int[][]arr,int target){

        for(int row = 0 ;row<arr.length;row++){

            for(int col = 0;col<arr[row].length;col++){

                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        
        return new int []{-1,-1};
    }
    public static void main(String[] args) {
        int[][]arr = {
            {12,23,4213},
            {12,12,5,12,5,125,1},
            {12,4,5,5,1,25,1,51}
        };

        int target = 23;

        int[] result = findElementIn2DArray(arr, target);

        System.out.println(Arrays.toString(result));

        
    }
}
