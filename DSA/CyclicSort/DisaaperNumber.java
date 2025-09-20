import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisaaperNumber{

    public static List<Integer> disappearedNumbers(int[]arr){

        cyclicSort(arr);

        List<Integer> result = new ArrayList<Integer>();

        int index = 0;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=i+1){
                result.add(i+1);
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
        int[] arr={4,3,2,7,8,2,3,1};

        System.out.println(disappearedNumbers(arr));

    }
}