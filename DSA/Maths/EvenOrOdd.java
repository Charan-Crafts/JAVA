
public class EvenOrOdd {

    public static int evenOrOdd(int number){

        return number&1;
    
    }
    public static void main(String[] args) {
        int number = 231;
        System.out.println(evenOrOdd(number)==1?"Odd":"Even");
    }
}
