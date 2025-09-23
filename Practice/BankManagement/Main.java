import java.util.concurrent.ForkJoinPool.ManagedBlocker;

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager();

        manager.createAccount("Charan", "9182");

        manager.checkBalance("CHARAN1001", 123);

        manager.credit("CHARAN1001", 123, 123223);

        manager.deposite("CHARAN1001", 123, 1231);

        manager.checkBalance("CHARAN1001", 123);

        manager.changePassword("CHARAN1001", 123,  12);

        manager.forgotPassword("CHARAN1001", "9182");

        manager.changeAccountHolderName("CHARAN1001", "Charan", "Sudha");

        manager.getAccountDetails("CHARAN1001", 12);

        manager.getAllTranscations();
        
    }
}
