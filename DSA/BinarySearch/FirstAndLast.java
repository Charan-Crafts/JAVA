package DSA.BinarySearch;

import java.util.Arrays;

public class FirstAndLast {


        public static int[] solution(int[] arr,int target){

            int [] res = {-1,-1};

            res[0]=search(arr,target,true);
            res[1]=search(arr,target,false);

            return res;
        }

        public static int search(int[] arr,int target,boolean forFirstIndex){
            int ans = -1;

            int left = 0;
            int right = arr.length-1;

            while (left<=right) {
                int mid = (left+right)/2;

                if(arr[mid]==target){
                    ans=mid;
                    if(forFirstIndex){
                        
                        right=mid-1;
                    }else{
                        
                        left=mid+1;
                    }
                }
                else if(arr[mid]>target){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            return ans;
        }
        public static void main(String[] args) {
        int[] arr = {5,7,7,8,8,10};

        int target = 8;

        System.out.println(Arrays.toString(solution(arr,target)));
    }
}
