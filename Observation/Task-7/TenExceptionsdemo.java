import java.util.*;
import java.io.*;

public class TenExceptionsDemo {

    public static void main(String[] args) {

        // 1. ArithmeticException
        System.out.println("===== 1. ArithmeticException =====");

        try {
            int a = 10;
            int b = 0;

            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }


        // 2. ArrayIndexOutOfBoundsException
        System.out.println("\n===== 2. ArrayIndexOutOfBoundsException =====");

        try {
            int[] numbers = {10, 20, 30};

            System.out.println("Element: " + numbers[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid array index");
        }


        // 3. StringIndexOutOfBoundsException
        System.out.println("\n===== 3. StringIndexOutOfBoundsException =====");

        try {
            String name = "Java";

            System.out.println("Character: " + name.charAt(10));

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Invalid String index");
        }


        // 4. NullPointerException
        System.out.println("\n===== 4. NullPointerException =====");

        try {
            String value = null;

            System.out.println("Length: " + value.length());

        } catch (NullPointerException e) {
            System.out.println("Object reference is null");
        }


        // 5. NumberFormatException
        System.out.println("\n===== 5. NumberFormatException =====");

        try {
            String value = "ABC";

            int number = Integer.parseInt(value);

            System.out.println("Number: " + number);

        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }


        // 6. IllegalArgumentException
        System.out.println("\n===== 6. IllegalArgumentException =====");

        try {
            Thread.sleep(-100);

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument");

        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }


        // 7. ClassCastException
        System.out.println("\n===== 7. ClassCastException =====");

        try {
            Object value = "Java";

            Integer number = (Integer) value;

            System.out.println("Number: " + number);

        } catch (ClassCastException e) {
            System.out.println("Invalid type casting");
        }


        // 8. InputMismatchException
        System.out.println("\n===== 8. InputMismatchException =====");

        try {
            Scanner sc = new Scanner("ABC");

            int age = sc.nextInt();

            System.out.println("Age: " + age);

            sc.close();

        } catch (InputMismatchException e) {
            System.out.println("Please enter a valid integer");
        }


        // 9. NegativeArraySizeException
        System.out.println("\n===== 9. NegativeArraySizeException =====");

        try {
            int size = -5;

            int[] numbers = new int[size];

            System.out.println("Array created");

        } catch (NegativeArraySizeException e) {
            System.out.println("Array size cannot be negative");
        }


        // 10. FileNotFoundException
        System.out.println("\n===== 10. FileNotFoundException =====");

        try {
            FileReader file = new FileReader("abc.txt");

            System.out.println("File opened successfully");

            file.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        } catch (IOException e) {
            System.out.println("Error while closing file");
        }


        System.out.println("\n===== PROGRAM COMPLETED =====");
    }
}
