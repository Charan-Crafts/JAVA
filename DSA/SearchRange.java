
public class SearchRange {

    public static boolean searchRange(int [] arr,int start,int end,int target){

        //search for the element within the specified range that is start,end

        for(int i = start ;i<=end;i++){
            if(arr[i]== target){
                return true;
            }
        }

        return false;

    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int target = 3;

        int start = 1;
        int end = 3;

        System.out.println(searchRange(numbers,start,end,target));
    }
}
