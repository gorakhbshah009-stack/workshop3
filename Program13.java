package week3;

// Program 13: BankAccount with multiple constructors (constructor overloading)

class BankAccount13 {
    String accountNumber;
    double balance;
    String accountHolderName;
    String accountHolderAddress;

    // Constructor 1: No arguments
    BankAccount13() {
        accountNumber        = "N/A";
        balance              = 0;
        accountHolderName    = "Unknown";
        accountHolderAddress = "Unknown";
    }

    // Constructor 2: Only name
    BankAccount13(String name) {
        accountNumber        = "N/A";
        balance              = 0;
        accountHolderName    = name;
        accountHolderAddress = "Not given";
    }

    // Constructor 3: Name and balance
    BankAccount13(String name, double balance) {
        accountNumber        = "N/A";
        this.balance         = balance;
        accountHolderName    = name;
        accountHolderAddress = "Not given";
    }

    // Constructor 4: All details
    BankAccount13(String accNum, String name, double balance, String address) {
        accountNumber        = accNum;
        accountHolderName    = name;
        this.balance         = balance;
        accountHolderAddress = address;
    }

    void display() {
        System.out.println("Account : " + accountNumber + " | Name: " + accountHolderName
                           + " | Balance: " + balance + " | Address: " + accountHolderAddress);
    }
}

public class Program13 {
    public static void main(String[] args) {

        BankAccount13 b1 = new BankAccount13();
        BankAccount13 b2 = new BankAccount13("Anish Shrestha");
        BankAccount13 b3 = new BankAccount13("Puja Lama", 7500.00);
        BankAccount13 b4 = new BankAccount13("ACC403", "Rajan Poudel", 15000.00, "Bhaktapur, Nepal");

        b1.display();
        b2.display();
        b3.display();
        b4.display();
    }
}
