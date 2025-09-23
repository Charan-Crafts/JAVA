
public class RotatedBinary {
    public static int binarySearch(int[] arr ,int target ){

        int left = 0;
        int right = arr.length-1;

        while(left<right){

            int mid = (left+right)/2;

            if(arr[mid]==target){
                return mid;
            }else if(arr[mid] < arr[arr.length-1]){
                right=mid-1;
            }else if(arr[mid]>target){
                left=mid+1;
            }
        }
    }
    public static void main(String[] args) {
        
        int[] arr= {5,6,7,8,1,3,4};

        int target = 4;

        System.out.println(binarySearch(arr,target));

    }
}
