package week3;

// Program 3 & 4: Define BankAccount class and create an object

class BankAccount {
    String accountNumber;
    double balance;
    String accountHolderName;
    String accountHolderAddress;
}

public class Program3 {
    public static void main(String[] args) {

        // Program 4: Create object and initialize attributes
        BankAccount account = new BankAccount();
        account.accountNumber      = "ACC101";
        account.balance            = 5000.00;
        account.accountHolderName  = "Ram Sharma";
        account.accountHolderAddress = "Kathmandu, Nepal";

        System.out.println("Account Number : " + account.accountNumber);
        System.out.println("Holder Name    : " + account.accountHolderName);
        System.out.println("Address        : " + account.accountHolderAddress);
        System.out.println("Balance        : " + account.balance);
    }
}
