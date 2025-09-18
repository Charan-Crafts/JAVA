
public class FindMinimum {

    public static int findMinimumNumber(int[] arr){

        if(arr.length==1){
            return arr[0];
        }

        int min=arr[0];

        for(int i =1 ;i<arr.length;i++){

            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        
        int [] arr = {12,4,1,2,3,2,6,23411,23};

        System.out.println(findMinimumNumber(arr));

        
    }
}
