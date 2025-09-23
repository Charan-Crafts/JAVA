package DSA.Recursion;

public class Fib {
    public static int fib(int n) {

        if (n == 0) {
            return n;
        } else if (n == 1) {
            return n;
        }
        // System.out.println(n);
        return fib(n - 1)+fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
