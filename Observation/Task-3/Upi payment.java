interface PaymentService {
    void pay(String upiId, double amount)
            throws InvalidUPIException,
                   InvalidAmountException,
                   InsufficientBalanceException;

    void checkBalance();
}

class Wallet {
    private String userName;
    private String mobileNumber;
    private String upiId;
    private double balance;

    Wallet(String userName, String mobileNumber,
           String upiId) {
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.upiId = upiId;
        this.balance = 0.0;
    }

    public void addMoney(double amount)
            throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Amount must be greater than zero.");
        }

        balance += amount;
        System.out.println("Money added: Rs." + amount);
    }

    public double getBalance() {
        return balance;
    }

    public String getUpiId() {
        return upiId;
    }

    public void displayWalletDetails() {
        System.out.println("\n===== WALLET DETAILS =====");
        System.out.println("User Name     : " + userName);
        System.out.println("Mobile Number : " + mobileNumber);
        System.out.println("UPI ID        : " + upiId);
        System.out.printf("Balance       : Rs.%.2f%n", balance);
    }

    public void deductMoney(double amount) {
        balance -= amount;
    }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidUPIException extends Exception {
    InvalidUPIException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

class UPIPayment implements PaymentService {
    private Wallet wallet;

    UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    @Override
    public void pay(String upiId, double amount)
            throws InvalidUPIException,
                   InvalidAmountException,
                   InsufficientBalanceException {

        // UPI validation using String operations
        if (upiId == null || !upiId.contains("@")) {
            throw new InvalidUPIException(
                    "Invalid UPI ID.");
        }

        // Amount validation
        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Payment amount must be greater than zero.");
        }

        // Balance validation
        if (amount > wallet.getBalance()) {
            throw new InsufficientBalanceException(
                    "Insufficient wallet balance.");
        }

        wallet.deductMoney(amount);

        System.out.println("Payment Successful!");
        System.out.println("Paid To       : " + upiId);
        System.out.println("Amount        : Rs." + amount);
        System.out.println("Transaction completed successfully.");
    }

    @Override
    public void checkBalance() {
        System.out.printf("Available Balance: Rs.%.2f%n",
                wallet.getBalance());
    }
}

public class UPIDigitalWallet {
    public static void main(String[] args) {

        Wallet wallet = new Wallet(
                "Rahul",
                "9876543210",
                "rahul@upi");

        UPIPayment payment = new UPIPayment(wallet);

        try {
            wallet.addMoney(10000);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        wallet.displayWalletDetails();

        System.out.println("\n===== UPI PAYMENT =====");

        try {
            payment.pay("priya@upi", 2500);
        } catch (InvalidUPIException |
                 InvalidAmountException |
                 InsufficientBalanceException e) {
            System.out.println("Transaction Failed: "
                    + e.getMessage());
        } finally {
            System.out.println("Transaction process completed.");
        }

        System.out.println("\n===== BALANCE CHECK =====");
        payment.checkBalance();

        System.out.println("\n===== INVALID TRANSACTION TEST =====");

        try {
            payment.pay("invalidupi", 2000);
        } catch (InvalidUPIException |
                 InvalidAmountException |
                 InsufficientBalanceException e) {
            System.out.println("Transaction Failed: "
                    + e.getMessage());
        } finally {
            System.out.println("Transaction process completed.");
        }

        System.out.println("\n===== FINAL WALLET DETAILS =====");
        wallet.displayWalletDetails();
    }
}
