package week3;

// Program 12: Customer class combining BankAccount and encapsulation

class BankAccount12 {
    private String accountNumber;
    private double balance;

    BankAccount12(String accNum, double bal) {
        accountNumber = accNum;
        balance       = bal;
    }

    public String getAccountNumber() { return accountNumber; }
    public double getBalance()       { return balance; }
}

class Customer {
    private int           customerId;
    private String        name;
    private BankAccount12 bankAccount;

    // Parameterized constructor
    Customer(int id, String name, BankAccount12 account) {
        customerId  = id;
        this.name   = name;
        bankAccount = account;
    }

    // Getters
    public int           getCustomerId()  { return customerId; }
    public String        getName()        { return name; }
    public BankAccount12 getBankAccount() { return bankAccount; }

    // Setter
    public void setName(String name) { this.name = name; }

    public void display() {
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Name          : " + name);
        System.out.println("Account No    : " + bankAccount.getAccountNumber());
        System.out.println("Balance       : " + bankAccount.getBalance());
        System.out.println();
    }
}

public class Program12 {
    public static void main(String[] args) {

        BankAccount12 acc1 = new BankAccount12("ACC301", 12000.00);
        BankAccount12 acc2 = new BankAccount12("ACC302", 4500.00);

        Customer c1 = new Customer(1, "Bikash Karki", acc1);
        Customer c2 = new Customer(2, "Sunita Magar", acc2);

        c1.display();
        c2.display();

        // Use setter to update name
        c2.setName("Sunita Gurung");
        System.out.println("Updated name of c2: " + c2.getName());
    }
}
