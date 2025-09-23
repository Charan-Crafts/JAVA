
public class TransactionDetails {
    
    protected String accountNumber ;

    protected String typeOfTransaction;

    protected double amount ; 
    public TransactionDetails(String accountNumber,double amount){
        this.accountNumber= accountNumber;
        this.amount = amount;
    }

    public String getTransaction(){
        return this.typeOfTransaction;
    }
    
    public String getAccountNumber(){
        return this.accountNumber;
    }

    public String setDebitTransaction(){
        return this.typeOfTransaction="Debit";
    }

    public double getAmount(){
        return this.amount;
    }
    public String setCreditTransaction(){
        return this.typeOfTransaction="Credit";
    }
}
