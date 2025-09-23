
public class Account {
    protected String accountHolderName ;

    protected static int counter = 1000;

    final static String IFSCCODE="CHARANBANK";

    protected double  balance;

    protected String accountNumber = "CHARAN";

    protected String contactNumber ;

    protected int password;

    public Account(String accountHolderName, String contactNumber){
        counter++;
        this.accountHolderName=accountHolderName;
        this.accountNumber+=counter;
        this.balance=0;
        this.contactNumber=contactNumber;     
        this.password=(int)(Math.random()*10000);
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public String getAccountHolderName(){
        return this.accountHolderName;
    }

    public double getBalance(){
        return this.balance;
    }

    public int getPassword(){
        return this.password;
    }

    public String getIFSCCODE(){
        return this.IFSCCODE;
    }

    public String getContactNumber(){
        return this.contactNumber;
    }

    public void getAccountInfo(){
        System.out.println(" --------------------- User Details --------------------- ");
        System.out.println("Account Number : "+getAccountNumber());
        System.out.println("Account Holder name : "+getAccountHolderName());
        System.out.println("IFSC CODE : "+getIFSCCODE());
        System.out.println("Balance : "+getBalance());
        System.out.println(" ---------------------             ---------------------");
    }

}
