package week3;

// Program 7: Parameterized constructor for BankAccount

class BankAccount7 {
    String accountNumber;
    double balance;
    String accountHolderName;
    String accountHolderAddress;

    // Parameterized constructor
    BankAccount7(String accNum, double bal, String name, String address) {
        accountNumber      = accNum;
        balance            = bal;
        accountHolderName  = name;
        accountHolderAddress = address;
    }

    void display() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + accountHolderName);
        System.out.println("Address        : " + accountHolderAddress);
        System.out.println("Balance        : " + balance);
    }
}

public class Program7 {
    public static void main(String[] args) {

        BankAccount7 account = new BankAccount7("ACC202", 8000.00, "Hari Bahadur", "Pokhara, Nepal");
        account.display();
    }
}
