import java.util.Arrays;

public class FirstMissingPositive{

    public static int firstMissingPositive(int[] arr){
        cyclicSort(arr);
        int result = arr.length;

        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return arr.length+1;
    }

    public static void cyclicSort(int [] arr){
        int i = 0;

        while(i<arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i]<=0){
                i++;
            }else if(arr[i]>=arr.length){
                i++;
            }else if(arr[i]!=arr[correctIndex]){
                int temp =arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,1};
        System.out.println(firstMissingPositive(arr));
    }
}