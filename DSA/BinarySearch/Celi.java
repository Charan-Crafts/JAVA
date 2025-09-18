
public class Celi {

    public static int findCeli(int[] arr,int target){
        
        for(int i = 0 ;i<arr.length;i++){
            if(arr[i]>=target){
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {5,10,15,20,25};
        int target = 7;

        System.out.println(findCeli(arr, target));

        System.out.println(1/2);
        
    }
}
