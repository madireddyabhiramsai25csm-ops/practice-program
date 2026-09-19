class Account {
    protected String accountNumber;
    protected String holderName;
    protected double balance;
    protected String accountType;

    // Constructor
    Account(String accountNumber, String holderName,
            double balance, String accountType) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs." + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Withdraw money
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
            return true;
        }

        System.out.println("Insufficient balance.");
        return false;
    }

    // Transfer money
    public void transfer(Account target, double amount) {
        if (withdraw(amount)) {
            target.deposit(amount);
            System.out.println("Transferred: Rs." + amount
                    + " to " + target.accountNumber);
        } else {
            System.out.println("Transfer failed.");
        }
    }

    // Display account details
    public void displayAccountDetails() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Holder Name    : " + holderName);
        System.out.println("Account Type   : " + accountType);
        System.out.printf("Balance        : Rs.%.2f%n", balance);
    }
}


// Savings Account
class SavingsAccount extends Account {
    private double interestRate;

    SavingsAccount(String accountNumber, String holderName,
                   double balance, double interestRate) {
        super(accountNumber, holderName, balance, "Savings");
        this.interestRate = interestRate;
    }

    // Calculate interest
    public double calculateInterest() {
        return balance * interestRate / 100;
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.println("Interest Rate  : " + interestRate + "%");
        System.out.printf("Interest        : Rs.%.2f%n",
                calculateInterest());
    }
}


// Current Account
class CurrentAccount extends Account {
    private double overdraftLimit;

    CurrentAccount(String accountNumber, String holderName,
                   double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance, "Current");
        this.overdraftLimit = overdraftLimit;
    }

    // Overriding withdraw method
    @Override
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
            return true;
        }

        System.out.println("Withdrawal exceeds overdraft limit.");
        return false;
    }

    @Override
    public void displayAccountDetails() {
        super.displayAccountDetails();
        System.out.printf("Overdraft Limit: Rs.%.2f%n",
                overdraftLimit);
    }
}


// Main Class
public class BankAccountDemo {
    public static void main(String[] args) {

        // Creating objects
        SavingsAccount savings =
                new SavingsAccount("SA101", "Rahul", 10000, 5.0);

        CurrentAccount current =
                new CurrentAccount("CA201", "Priya", 15000, 5000);

        System.out.println("===== SAVINGS ACCOUNT =====");
        savings.displayAccountDetails();

        System.out.println("\nDepositing Rs.2000...");
        savings.deposit(2000);

        System.out.println("\nWithdrawing Rs.1500...");
        savings.withdraw(1500);

        System.out.println("\n===== AFTER TRANSACTIONS =====");
        savings.displayAccountDetails();

        System.out.println("\n===== CURRENT ACCOUNT =====");
        current.displayAccountDetails();

        System.out.println("\nWithdrawing Rs.18000...");
        current.withdraw(18000);

        System.out.println("\n===== AFTER WITHDRAWAL =====");
        current.displayAccountDetails();

        System.out.println("\n===== TRANSFER =====");
        System.out.println(
            "Transferring Rs.2000 from Savings to Current..."
        );

        savings.transfer(current, 2000);

        System.out.println("\n===== FINAL ACCOUNT DETAILS =====");

        System.out.println("\nSavings Account:");
        savings.displayAccountDetails();

        System.out.println("\nCurrent Account:");
        current.displayAccountDetails();
    }
}
