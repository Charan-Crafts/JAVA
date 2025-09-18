public class FindNumberWithEvenDigits{

    static int numberOfDigits(int number){
        int count = 0;
        while(number>0){
            count+=1;
            number=number/10;
        }
        return count;
    }

    static int findNumberWithEvenDigits(int[] arr){

        int count = 0;

        for(int i = 0;i<arr.length;i++){
            int result = numberOfDigits(arr[i]);
            if(result%2==0){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] numbers = {12, 345, 2, 6, 7896};

        System.out.println(findNumberWithEvenDigits(numbers));
    }
}