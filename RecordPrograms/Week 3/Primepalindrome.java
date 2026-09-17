import java.util.Scanner;

public class PrimePalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check prime
        boolean prime = true;

        if (n <= 1) {
            prime = false;
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
            }
        }

        // Check palindrome
        int temp = n;
        int reverse = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        // Final result
        if (prime && n == reverse) {
            System.out.println(n + " is a Prime Palindrome.");
        } else {
            System.out.println(n + " is not a Prime Palindrome.");
        }

        sc.close();
    }
}
