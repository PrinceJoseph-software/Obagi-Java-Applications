//This program calculates the world population
//Exercise 2.34 (World Population Growth Calculator)

import java.util.Scanner;

public class PopulationGrowth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter current world population: ");
        long population = input.nextLong();

        System.out.print("Enter annual growth rate (as a percentage): ");
        double growthRate = input.nextDouble();

        System.out.println("\nEstimated population for the next 5 years:");
        for (int year = 1; year <= 5; year++) {
            population += population * (growthRate / 100);
            System.out.printf("Year %d: %,d%n", year, population);
        }
    }
}
