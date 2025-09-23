import java.util.Scanner;
import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the Array size: ");
        Scanner in = new Scanner(System.in);

        int arraySize = in.nextInt();
        int[] numbers = new int[arraySize];

        for(int i = 0 ;i<arraySize;i++){
            System.out.println("Enter the element at index " + i + ": ");
            int element = in.nextInt();
            numbers[i]=element;
        }

        System.out.println(Arrays.toString(numbers));
    }
}
