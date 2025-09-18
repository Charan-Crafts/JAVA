
public class LinearSearch {

    public static int linearSearch(int[] arr,int target){

        for(int i = 0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};

        int target = 2;

        int result =linearSearch(arr, target);

        if(result != -1){
            System.out.println("Target founded at index "+result);
        }else{
            System.out.println("Target not founded");
        }

    }
}
