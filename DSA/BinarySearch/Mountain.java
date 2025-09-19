
public class Mountain {

    public static int binarySearch(int[] arr,int target,int start,int end){

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end =  mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static int minIndex(int arr[],int target){


        int ans = -1;

        int start = 0;

        int end = arr.length-1;

        
        int mid = (start+end)/2;

        ans = binarySearch(arr, target, start, mid);
        if(ans!=-1){
            return ans;
        }
        else{
            ans = binarySearch(arr, target, mid+1, end);
            return ans;
        }
        
    }

    public static void main(String[] args) {
        int mountArr[] = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(minIndex(mountArr, target));
    }
}
