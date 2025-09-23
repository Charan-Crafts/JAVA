
public class Main {
    
    public static void printMessage(int count){
        
        if(count==0){
            System.out.println(count);
            return;
        }
        System.out.println(count);
        printMessage(count-1);
    }
    public static void main(String[] args) {
        printMessage(5);
    }
}
