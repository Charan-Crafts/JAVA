import java.util.Scanner;


class AgeException extends Exception{

    public AgeException(int age){
        
        super("Your age is "+age+" which is insufficent for this.");
    }
}
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age ");

        int age = scanner.nextInt();

       try {

        if(age<18){
            throw new AgeException(18);
        }
        else{
            System.out.println("Your eligable ..");
        }
        
       } catch (AgeException e) {
        System.out.println(e.getMessage());
       }
        
    }
}
