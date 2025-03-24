// This program does basic arithemetic calculations on two integers
//Exercise 2.15 (Arithmetic Operations on Two Integers)
import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.printf("Sum: %d%n", num1 + num2);
        System.out.printf("Product: %d%n", num1 * num2);
        System.out.printf("Difference: %d%n", num1 - num2);
        System.out.printf("Quotient: %d%n", num1 / num2);
    }
}
