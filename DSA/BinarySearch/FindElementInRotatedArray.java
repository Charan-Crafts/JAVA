public class FindElementInRotatedArray{

    public static int findHighestElement(int[] arr){

        int start = 0;

        int end = arr.length-1;

        while(start<end){
            int mid = (start+end)/2;

            if(arr[mid]>arr[end]){
                start = mid+1;
            }
            else{
                end = mid;
            }
        }
        return start;
    }

    public static int binarySearch(int arr[],int target,int start,int end){

        while (start<=end){
            int mid = (start+end)/2;

            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;

    }
    public static int result(int [] arr,int target){
        int ans= -1;

        int start =  0;
        int end = arr.length-1;

        int peakIndex = findHighestElement(arr);
        

        // if(arr[peakIndex]==target){
        //     return peakIndex;
        // }

        ans=binarySearch(arr, target, start, peakIndex);

        if(ans!=-1){
            return ans;
        }
        ans = binarySearch(arr,target,peakIndex+1,end);

        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {5,1,3};
        int target = 5;
        System.out.println(result(arr, target));
        
    }
}