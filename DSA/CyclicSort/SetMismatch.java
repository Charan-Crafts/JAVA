import java.util.Arrays;

public class SetMismatch {

    public static int[] setMismatch(int[]arr){
        cyclicSort(arr);
        int[] result = new int[2];

        for(int i = 0;i<arr.length;i++){

            if(arr[i]!=i+1){
                result[0]=arr[i];
                result[1]=i+1;
            }
        }
        return result;
    }

    public static void cyclicSort(int[] arr){

        int i = 0;

        while(i<arr.length){

            int correctIndex = arr[i]-1;

            if(arr[i]!=arr[correctIndex]){
                int temp = arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }
            else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = { 1, 1 };
        
        System.out.println(Arrays.toString(setMismatch(arr)));
    }
}

