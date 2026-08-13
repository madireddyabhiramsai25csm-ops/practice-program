
import java.util.Scanner;

public class PartD{

    int factorial(int n) {
        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    boolean prime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    int max(int a, int b) {
        return (a > b) ? a : b;
    }

    double areaOfCircle(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PartD obj = new PartD();

        System.out.println("Enter your choice:");
        System.out.println("1. Factorial");
        System.out.println("2. Prime");
        System.out.println("3. Maximum of two numbers");
        System.out.println("4. Area of circle");

        int ch = sc.nextInt();

        switch (ch) {

            case 1:
                System.out.println("Enter a number:");
                int N3 = sc.nextInt();

                int fact = obj.factorial(N3);

                System.out.println("Factorial of " + N3 + " is " + fact);

                break;

            case 2:
                System.out.println("Enter a number:");
                int N4 = sc.nextInt();

                boolean isPrime = obj.prime(N4);

                if (isPrime) {
                    System.out.println("Prime Number");
                } else {
                    System.out.println("Not a Prime Number");
                }

                break;

            case 3:
                System.out.println("Enter 1st number:");
                int a = sc.nextInt();

                System.out.println("Enter 2nd number:");
                int b = sc.nextInt();

                System.out.println("Maximum = " + obj.max(a, b));

                break;

            case 4:
                System.out.println("Enter radius:");
                double r = sc.nextDouble();

                System.out.println("Area = " + obj.areaOfCircle(r));

                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}