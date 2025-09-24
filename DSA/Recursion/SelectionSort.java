import java.util.Arrays;

public class SelectionSort{

    public static void selectionSort(int[] arr,int row,int col,int min){

        if(row>arr.length-1){
            return;
        }
        
        if(col<arr.length){
            if(arr[col]<arr[min]){
                min=col;
            }
            selectionSort(arr, row, col+1, min);
        }else{
            int temp = arr[row];
            arr[row]=arr[min];
            arr[min]=temp;
            selectionSort(arr, row+1, row+2, row+1);
        }
    }
    public static void main(String[] args) {
        int [] arr={5,4,3,2,1};

        selectionSort(arr,0,1,0);

        System.out.println(Arrays.toString(arr));
    }
}