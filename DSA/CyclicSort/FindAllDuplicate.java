import java.util.*;
public class FindAllDuplicate {

    public static void cyclicSort(int[] arr){

        int i = 0;

        while(i<arr.length){

            int correctIndex  = arr[i]-1;

            if(arr[correctIndex]!=arr[i]){

                int temp =arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }else{
                i++;
            }
        }
    }
    public static List<Integer> findAllDuplicate(int[] arr){

        cyclicSort(arr);

        List<Integer> result = new ArrayList<>();

        for(int i = 0;i<arr.length;i++){

            if(arr[i]!=i+1){
                result.add(arr[i]);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = { 1,1,2};
        
       List<Integer> result = findAllDuplicate(arr);

       System.out.println(result);
    }
}
