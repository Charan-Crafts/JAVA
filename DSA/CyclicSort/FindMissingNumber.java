
public class FindMissingNumber {

    public static int findMissingNumber(int [] arr){
        int length = arr.length+1;

        int totalSum = (length*(length-1))/2;

        int currSum = 0;

        for(int ele : arr){
            currSum+=ele;
        }
        return (totalSum-currSum);
    }
    public static void main(String[] args) {
        int [] arr={0,1,3};
        System.out.println(findMissingNumber(arr));
    }
}
