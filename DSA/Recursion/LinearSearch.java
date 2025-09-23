
public class LinearSearch {

    public static int linearSearch(int[] arr,int target,int size){

        if(size<0){
            return -1;
        }

        if(arr[size]==target){
            return size;
        }
        return linearSearch(arr, target, size-1);
    }
    public static void main(String[] args) {
        
        int [] arr = {123,412,21,5,5,12,512};

        int target = 5;

        System.out.println(linearSearch(arr,target,arr.length-1));
    }
}
