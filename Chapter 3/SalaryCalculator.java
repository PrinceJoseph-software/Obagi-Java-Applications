//Salary Calculator

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int REGULAR_HOURS = 40;
        final double OVERTIME_RATE = 1.5;
        
        for (int i = 1; i <= 3; i++) {
            System.out.printf("\nEnter hours worked for employee %d: ", i);
            double hours = input.nextDouble();
            
            System.out.printf("Enter hourly rate for employee %d: ", i);
            double rate = input.nextDouble();
            
            double grossPay;
            if (hours <= REGULAR_HOURS) {
                grossPay = hours * rate;
            } else {
                grossPay = REGULAR_HOURS * rate + 
                          (hours - REGULAR_HOURS) * rate * OVERTIME_RATE;
            }
            
            System.out.printf("Gross pay for employee %d: $%.2f%n", i, grossPay);
        }
    }
}