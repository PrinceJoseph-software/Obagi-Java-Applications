//Sales Commission Calculator

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double BASE_SALARY = 200.0;
        final double COMMISSION_RATE = 0.09;
        
        System.out.print("Enter number of items sold: ");
        int items = input.nextInt();
        
        double totalSales = 0;
        for (int i = 1; i <= items; i++) {
            System.out.printf("Enter value of item %d: ", i);
            totalSales += input.nextDouble();
        }
        
        double earnings = BASE_SALARY + (totalSales * COMMISSION_RATE);
        System.out.printf("Salesperson's earnings: $%.2f%n", earnings);
    }
}