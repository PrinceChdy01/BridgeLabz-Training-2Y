// BankAccount.java
class BankAccount {
    // Attributes
    String accountHolder;
    int accountNumber;
    double balance;

    // Constructor
    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrawn: " + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }

    // Method to display current balance
    void displayBalance() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}

// Main class
public class ATMSimulation {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount acc1 = new BankAccount("John Doe", 123456, 10000.0);

        // Show initial balance
        acc1.displayBalance();
        System.out.println();

        // Deposit money
        acc1.deposit(5000);
        acc1.displayBalance();
        System.out.println();

        // Withdraw money
        acc1.withdraw(3000);
        acc1.displayBalance();
        System.out.println();

        // Try withdrawing more than balance
        acc1.withdraw(20000);
        acc1.displayBalance();
    }
}
