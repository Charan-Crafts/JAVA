import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("------------------Welcome to My Pizza Store-------------------");

        System.out.println("What kind of Pizza You want veg(1) or non-veg?(2) ");

        int choice = in.nextInt();

        Pizza person1 = new Pizza(choice==1?true:false);

    }
}
