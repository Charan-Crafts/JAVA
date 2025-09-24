package DSA.Recursion;

import java.util.Arrays;

public class MergeSort {

    public static int[] conquer(int[] arr1,int arr2[]){

        int[] result = new int[arr1.length+arr2.length];

        int left = 0 ;

        int right = 0;

        int k = 0;

        while(left<arr1.length && right <arr2.length){

            if(arr1[left]<arr2[right]){
                result[k]=arr1[left];
                left++;
            }else{
                result[k]=arr2[right];
                right++;
            }
            k++;
        }

        while(left<arr1.length){
            result[k]=arr1[left];
            left++;
            k++;
        }
        while(right<arr2.length){
            result[k]=arr2[right];
            right++;
            k++;
        }

        return result;
    }
    
    public static int[] divide(int[] arr,int start,int end){
        
        if(start == end){
            return new int[]{arr[start]};
        }

        int mid = (start + end)/2;

        int[] leftArray = divide(arr, start, mid);

        int[] rightArray = divide(arr,mid+1,end);

        return conquer(leftArray, rightArray);

    }
    public static void main(String[] args) {
        
        int [] arr = {5,4,524,1245,12,24,21,5,5,1,2};

        arr=divide(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));


    }
}
