// This program calculates weight
//Exercise 2.33 (BMI Calculator)

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();

        System.out.print("Enter height in meters: ");
        double height = input.nextDouble();

        double bmi = weight / (height * height);

        System.out.printf("BMI: %.2f%n", bmi);
        System.out.println("BMI Categories:");
        System.out.println("Underweight: BMI < 18.5");
        System.out.println("Normal weight: 18.5–24.9");
        System.out.println("Overweight: 25–29.9");
        System.out.println("Obesity: BMI >= 30");
    }
}
