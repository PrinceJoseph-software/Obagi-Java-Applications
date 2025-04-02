//Gas Mileage

import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalMiles = 0, totalGallons = 0;
        
        System.out.print("Enter miles driven (-1 to quit): ");
        int miles = input.nextInt();
        
        while (miles != -1) {
            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();
            
            double mpg = (double)miles / gallons;
            System.out.printf("MPG for this trip: %.2f%n", mpg);
            
            totalMiles += miles;
            totalGallons += gallons;
            double totalMPG = (double)totalMiles / totalGallons;
            System.out.printf("Total MPG: %.2f%n%n", totalMPG);
            
            System.out.print("Enter miles driven (-1 to quit): ");
            miles = input.nextInt();
        }
    }
}