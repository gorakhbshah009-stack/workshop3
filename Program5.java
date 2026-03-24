package week3;

// Program 5: depositMoney() and withdrawMoney() methods in BankAccount

class BankAccount5 {
    String accountHolderName;
    double balance;

    void depositMoney(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    void withdrawMoney(double amount) {
        if (amount > balance) {
            System.out.println("Not enough balance!");
        } else {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        }
    }
}

public class Program5 {
    public static void main(String[] args) {

        BankAccount5 account = new BankAccount5();
        account.accountHolderName = "Sita Rai";
        account.balance = 1000.00;

        System.out.println("--- Deposit ---");
        account.depositMoney(500);

        System.out.println("--- Withdraw ---");
        account.withdrawMoney(300);

        System.out.println("--- Withdraw Too Much ---");
        account.withdrawMoney(5000);
    }
}
