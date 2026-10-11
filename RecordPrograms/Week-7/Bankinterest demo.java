import java.util.Scanner;

class RBI {
    double getRateOfInterest() {
        return 4.0;
    }
}

class SBI extends RBI {
    @Override
    double getRateOfInterest() {
        return 7.0;
    }
}

class ICICI extends RBI {
    @Override
    double getRateOfInterest() {
        return 6.5;
    }
}

class PNB extends RBI {
    @Override
    double getRateOfInterest() {
        return 6.0;
    }
}

class Account {
    String accountHolder;
    double balance;

    Account(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void displayAccount() {
        System.out.println("Customer Name: " + accountHolder);
        System.out.println("Balance      : " + balance);
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void displayCustomer() {
        System.out.println("Customer Name: " + name);
    }
}

public class BankInterestDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(
            "Enter the Bank name to find the rate of Interest: "
        );

        String bankName = sc.nextLine().trim();

        // RBI reference demonstrates dynamic polymorphism.
        RBI bank;

        if (bankName.equalsIgnoreCase("RBI")) {
            bank = new RBI();
        } else if (bankName.equalsIgnoreCase("SBI")) {
            bank = new SBI();
        } else if (bankName.equalsIgnoreCase("ICICI")) {
            bank = new ICICI();
        } else if (bankName.equalsIgnoreCase("PNB")) {
            bank = new PNB();
        } else {
            System.out.println(
                "Invalid bank name. Please enter RBI, SBI, ICICI, or PNB."
            );

            sc.close();
            return;
        }

        System.out.println(
            bankName.toUpperCase()
            + " rate of interest is: "
            + bank.getRateOfInterest() + "%"
        );

        sc.close();
    }
}
