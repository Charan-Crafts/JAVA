package DSA.Recursion;

public class SumofNumbers {
    // public static int sum(int n) {
    //     if (n == 1) {
    //         return 1;
    //     }
    //     return n + sum(n - 1);
    // }

    public static int sum(int number){

        int remainder = number %10;

        int quotient = number /10;

        if(quotient==0){
            return remainder;
        }
        return remainder + sum(quotient);
    }
    public static void main(String[] args) {
        System.out.println(sum(412323123));
    }
}
