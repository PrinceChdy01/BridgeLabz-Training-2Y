public class BankAccount {
    private static String bankName = "Global Bank";
    private static int totalAccounts = 0;

    private final String accountNumber;  // final: cannot be changed after assignment
    private String accountHolderName;

    // Constructor using 'this' to resolve ambiguity
    public BankAccount(String accountHolderName, String accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) { // instanceof check
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
        } else {
            System.out.println("Object is not a BankAccount instance.");
        }
    }

    // Test main
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("John Doe", "ACC12345");
        BankAccount acc2 = new BankAccount("Jane Smith", "ACC67890");

        acc1.displayAccountDetails();
        System.out.println();

        acc2.displayAccountDetails();
        System.out.println();

        BankAccount.getTotalAccounts();

        // instanceof test with another object type
        Object obj = new Object();
        if (obj instanceof BankAccount) {
            ((BankAccount) obj).displayAccountDetails();
        } else {
            System.out.println("obj is not an instance of BankAccount");
        }
    }
}
