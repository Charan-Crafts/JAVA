import java.util.ArrayList;
import java.util.Arrays;

public class LeetCode34 {

    public static int[] solution(int[] arr,int target){
        int left=0;
        int right = arr.length-1;
        boolean isLeft = false;
        boolean isRight = false;

        int [] result;

        while(left<=right){
            if(arr[left]!=target){
                left++;
            }
            else{
                isLeft=true;
                break;
            }
            if(arr[right]!=target){
                right--;
            }else{
                isRight = true;
                break;
            }
        }

        while(left<=right){
            if(arr[left]==target){
                isLeft=true;
                break;
            }
            left++;
            if(left==right){
                isLeft=false;
            }
        }

        while(left<=right){
            if(arr[right]==target){
                isRight=true;
                break;
            }
            right++;
            if(right==left){
                isRight=false;
            }
        }

        if(isLeft==false && isRight==false){
            return result = new int[]{-1,-1};
        }

        return result=new int[]{left,right};
        
    }
    public static void main(String[] args) {
        
        int[] nums = {5,7,7,8,8,10};

        int target = 6;

        System.out.println(Arrays.toString(solution(nums, target)));
    }
}
