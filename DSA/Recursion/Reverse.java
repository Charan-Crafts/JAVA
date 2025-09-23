
public class Reverse {

    public static int reverseOfDigit(int number,int reverse){

        int remainder = number%10;

        int quotient = number/10;

        reverse = reverse*10 + remainder;

        if(quotient==0){
            return reverse;
        }
        return reverseOfDigit(number, reverse);

    }
    public static void main(String[] args) {
        System.out.println(reverseOfDigit(12323,0));
    }
     
}