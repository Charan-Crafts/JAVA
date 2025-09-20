package DSA.CyclicSort;

import java.util.Arrays;

public class FindDuplicate {

    public static int findDuplicate(int[] arr){

        cyclicSort(arr);
        int result = 0;

        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]!=i+1){
                return arr[i];
            }
        }
        
    }

    public static void cyclicSort(int[] arr) {

        int i = 0;

        while (i < arr.length) {

            int correctIndex = arr[i] - 1;

            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2 };
        
        System.out.println(findDuplicate(arr));
    }
}
