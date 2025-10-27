import java.util.ArrayList;
import java.util.List;

// Account class
class Account {
    private String accNumber;
    private double balance;
    private Bank bank;

    public Account(String accNumber, double balance, Bank bank) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.bank = bank;
    }

    public double getBalance() {
        return balance;
    }

    public Bank getBank() {
        return bank;
    }

    public String toString() {
        return "Account Number: " + accNumber + ", Balance: " + balance + ", Bank: " + bank.getName();
    }
}

// Customer class
class Customer {
    private String name;
    private List<Account> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        System.out.println(name + "'s Accounts:");
        for (Account acc : accounts) {
            System.out.println(acc);
        }
    }
}

// Bank class
class Bank {
    private String name;
    private List<Customer> customers;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Association: open account between customer and this bank
    public Account openAccount(Customer customer, String accNumber, double initialBalance) {
        Account newAccount = new Account(accNumber, initialBalance, this);
        customer.addAccount(newAccount);
        if (!customers.contains(customer)) {
            customers.add(customer);
        }
        return newAccount;
    }
}

// Demonstration
public class Banks {
    public static void main(String[] args) {
        Bank sbi = new Bank("State Bank of India");
        Bank icici = new Bank("ICICI Bank");

        Customer john = new Customer("John Doe");
        Customer alice = new Customer("Alice Smith");

        // John opens accounts in both SBI and ICICI
        sbi.openAccount(john, "SBI-1001", 5000.0);
        icici.openAccount(john, "ICICI-2002", 7500.0);

        // Alice opens an account in SBI
        sbi.openAccount(alice, "SBI-1003", 6000.0);

        // Customers view balances
        john.viewBalance();
        alice.viewBalance();
    }
}
