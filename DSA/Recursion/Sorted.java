
public class Sorted {

    public static boolean isSorted(int [] arr,int length){

        if(length<=1){
            return true;
        }

        if(arr[length-1]>=arr[length-2]){
            return isSorted(arr, length-1);
        }else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        
        int[] arr = {};

        System.out.println(isSorted(arr,arr.length-1));
    }
}
