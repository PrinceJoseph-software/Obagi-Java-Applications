//// This program calculates the Sum, Average, Product, Smallest, Largest of Three Integers of three integers
//Exercise 2.17 (Sum, Average, Product, Smallest, Largest of Three Integers)

import java.util.Scanner;

public class ThreeNumberStats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        int average = sum / 3; // Integer division
        int product = num1 * num2 * num3;

        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));

        System.out.printf("Sum: %d%nAverage: %d%nProduct: %d%n", sum, average, product);
        System.out.printf("Smallest: %d%nLargest: %d%n", smallest, largest);
    }
}
