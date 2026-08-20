class BankAccount {
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        }
    }

    // Public Getter method
    public double getBalance() {
        return balance;
    }

    // Public Setter method with validation logic
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Alice", 1000.0);
        
        // myAccount.balance = 5000; // Error: balance has private access
        
        myAccount.deposit(500.0);
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}