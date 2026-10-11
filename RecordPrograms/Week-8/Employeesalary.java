import java.util.Scanner;

interface Salary {
    void calculateSalary();
}

class RegularEmployee implements Salary {
    String employeeId;
    int basicPay = 25000;
    int hra = 15000;
    int ta = 5000;

    RegularEmployee(String employeeId) {
        this.employeeId = employeeId;
    }

    public void calculateSalary() {
        int total = basicPay + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}

class ContractEmployee implements Salary {
    String employeeId;
    int basicPay = 12000;
    int hra = 0;
    int ta = 3000;

    ContractEmployee(String employeeId) {
        this.employeeId = employeeId;
    }

    public void calculateSalary() {
        int total = basicPay + hra + ta;

        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("T.A: " + ta);
        System.out.println("Total Amount: " + total);
    }
}

class Vendor {
    String vendorId;

    Vendor(String vendorId) {
        this.vendorId = vendorId;
    }

    void displayDetails() {
        System.out.println("Vendor ID: " + vendorId);
        System.out.println(
            "Vendor salary details are not specified in the question."
        );
    }
}

public class EmployeeSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Id: ");
        String id = sc.nextLine().trim().toUpperCase();

        if (id.startsWith("R")) {
            Salary employee = new RegularEmployee(id);
            employee.calculateSalary();

        } else if (id.startsWith("C")) {
            Salary employee = new ContractEmployee(id);
            employee.calculateSalary();

        } else if (id.startsWith("V")) {
            Vendor vendor = new Vendor(id);
            vendor.displayDetails();

        } else {
            System.out.println("Invalid Employee ID.");
            System.out.println(
                "Use R for Regular, C for Contract, or V for Vendor."
            );
        }

        sc.close();
    }
}
