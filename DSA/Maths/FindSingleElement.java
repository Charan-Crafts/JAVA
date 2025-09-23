package DSA.Maths;

import java.util.Arrays;

public class FindSingleElement {

    public static int uniqueElement(int[] arr){
        int unique = 0;

        for(int ele : arr){
            unique = unique^ele;
        }

        return unique;
    }

        
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};

        System.out.println(uniqueElement(arr));
        
    }
}
