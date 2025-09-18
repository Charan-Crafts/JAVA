
public class BinarySearch {

    public static int binarySearch(int arr[], int target){

        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = (int)(left + right)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(arr[mid]>target){
                right=mid-1;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int arr[] = {2,3,5,6,7,8,88};

        int target = 5;

        System.out.println(binarySearch(arr, target));
    }
}
