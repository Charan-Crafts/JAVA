
public class Manager extends Bank {

    public void createAccount(String userName, String contactNumber) {

        // check the user account is already exists with the mobile number;

        for (Account details : accountDetails) {
            if (details.getContactNumber().equals(contactNumber)) {
                System.out.println("❌ Account already Exists with this number..");
                return;
            }
        }
        Account newAccount = new Account(userName, contactNumber);
        accountDetails.add(newAccount);
        System.out.println("✅ Account is created ");
        newAccount.getAccountInfo();
    }

    public void checkBalance(String accountNumber, int password) {

        // check wheather the account number is valid or not

        for (Account details : accountDetails) {

            if (details.getAccountNumber().equals(accountNumber)) {

                // Check wheather the password

                if (details.getPassword() != password) {
                    System.out.println("Incorrect Password ...");
                    return;
                } else {
                    System.out.println(details.getBalance());
                    return;
                }
            }
        }

        System.out.println("Account not found ...  ");
    }

    public void getPassword(String accountNumber) {

        for (Account accountDetails : accountDetails) {

            if (accountDetails.getAccountNumber().equals(accountNumber)) {
                System.out.println(accountDetails.getPassword());
                return;
            }
        }
        System.out.println("Account not founded .. ");
    }

    public void deposite(String accountNumber, int password, double amount) {

        // Check account is exists or not

        for (Account details : accountDetails) {

            if (details.getAccountNumber().equals(accountNumber)) {

                // Password Check

                if (details.getPassword() != password) {
                    System.out.println("Incorrect password ... ");
                    return;
                }

                // Check the Sufficent balance

                if (details.getBalance() < amount) {
                    System.out.println("Insufficent balance...");
                    return;
                } else {
                    details.deposite(amount);
                    System.out.println("Amount deposited .Thank You ...");
                    TransactionDetails newTransaction = new TransactionDetails(accountNumber,amount);
                    newTransaction.typeOfTransaction = newTransaction.setDebitTransaction();
                    
                    transactionDetails.add(newTransaction);
                    return;
                }
            }
        }

        System.out.println("Account doesn't Exists ...");

    }

    public void credit(String accountNumber, int password, double amount) {
        for (Account details : accountDetails) {

            if (details.getAccountNumber().equals(accountNumber)) {
                // Check the password

                if (details.getPassword() == password) {

                    details.credit(amount);

                    System.out.println("Amount successfully Credited into your bank Account Thank You");

                    TransactionDetails newTransaction = new TransactionDetails(accountNumber,amount);

                    newTransaction.typeOfTransaction = newTransaction.setCreditTransaction();

                    transactionDetails.add(newTransaction);
                    return;
                } else {
                    System.out.println("Invalid password ..");
                    return;
                }
            }
        }

        System.out.println("Invalid Account Number");
    }

    public void changePassword(String accountNumber, int oldPassword, int newPassword) {

        for (Account details : accountDetails) {

            if (details.getAccountNumber().equals(accountNumber)) {

                if (details.getPassword() != oldPassword) {
                    System.out.println("Invalid Credentials .. ");
                    return;
                } else {
                    details.setPassword(newPassword);
                    System.out.println("Password Updated .. ");
                    return;
                }
            }
        }
        System.out.println("Invalid Details.. ");
    }

    public void forgotPassword(String accountNumber, String contactNumber) {

        for (Account details : accountDetails) {

            if (details.getAccountNumber().equals(accountNumber)) {

                if (details.getContactNumber().equals(contactNumber)) {

                    System.out.println(details.getPassword());

                    return;
                } else {
                    System.out.println("Invalid Credentials");
                    return;
                }
            }
        }
        System.out.println("Invalid credentails..");
    }

    public void changeAccountHolderName(String accountNumber, String oldName, String newName) {

        for (Account details : accountDetails) {

            if (details.getAccountNumber().equals(accountNumber)) {

                if (details.getAccountHolderName().equals(oldName)) {

                    details.setAccountHolderName(newName);

                    System.out.println("Account Holder name is Updated .. ");
                    return;

                } else {
                    System.out.println("Invalid Name ...");
                }
            }
        }
        System.out.println("Invalid Account Number ... ");
    }

    public void getAccountDetails(String accountNumber, int password) {

        for (Account details : accountDetails) {

            if (details.getAccountNumber().equals(accountNumber)) {

                if (details.getPassword() == password) {
                    details.getAccountInfo();
                    return;
                } else {
                    System.out.println("Invalid Credentails..");
                }
            }
        }
        System.out.println("Invalid Account Number..");
    }

    public void getAllTranscations() {
        System.out.println("---------------- Transaction Details -----------------");
        for (TransactionDetails details : transactionDetails) {

            System.err.println("Account Number : " + details.getAccountNumber());
            System.out.println("Action :    " + details.getTransaction());
            System.out.println("Amount   : "+details.getAmount());
            System.out.println(" ---------------------------------------------------");
        }
    }

}
