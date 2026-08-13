import java.util.Scanner;

public class PartC{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice:");
        System.out.println("1. Table");
        System.out.println("2. Numbers (1-N)");
        System.out.println("3. Sum of n numbers");
        System.out.println("4. Fibonacci");

        int ch = sc.nextInt();

        switch (ch) {

            case 1:
                System.out.println("Enter a number for multiplication table:");
                int num = sc.nextInt();

                System.out.println("Multiplication table of " + num + ":");

                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + " x " + i + " = " + (num * i));
                }

                break;
            case 2:
                System.out.println("Enter a number N:");
                int N = sc.nextInt();

                System.out.println("Numbers from 1 to " + N + ":");

                for (int i = 1; i <= N; i++) {
                System.out.println(i);
            }

                break;

            case 3:
                System.out.println("Enter a Number N:");
                int N1 = sc.nextInt();

                int sum = 0;

                for (int i = 1; i <= N1; i++) {
                sum+=i;
            }

                System.out.println("Sum of first " + N1 + " natural numbers: " + sum);

                break;

            case 4:
                System.out.println("Enter a number:");
                int N2 = sc.nextInt();

                int x = 0, y = 1;

                System.out.println("Fibonacci Series up to " + N2 + ":");

                while (x <= N2) {
                System.out.print(x + " ");

                int next = x + y;
                x = y;
                y = next;
            }

            System.out.println();

                break;

            default: 
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}


