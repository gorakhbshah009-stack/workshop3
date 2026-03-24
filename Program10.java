package week3;

// Program 10: Private balance with public getter method

class BankAccount10 {
    String accountHolderName;
    private double balance;   // private - cannot be accessed directly outside

    BankAccount10(String name, double bal) {
        accountHolderName = name;
        balance = bal;
    }

    // Public getter for private balance
    public double getBalance() {
        return balance;
    }
}

public class Program10 {
    public static void main(String[] args) {

        BankAccount10 account = new BankAccount10("Gita Thapa", 3500.00);

        // account.balance = 9999;  // ERROR: balance is private!

        // Access balance using getter
        System.out.println("Account Holder : " + account.accountHolderName);
        System.out.println("Balance        : " + account.getBalance());
    }
}
