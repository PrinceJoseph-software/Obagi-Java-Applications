//Find the Largest Number

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1, number, largest;
        
        System.out.print("Enter number 1: ");
        largest = input.nextInt();
        
        while (counter < 10) {
            System.out.printf("Enter number %d: ", counter + 1);
            number = input.nextInt();
            
            if (number > largest) {
                largest = number;
            }
            counter++;
        }
        
        System.out.printf("Largest number is: %d%n", largest);
    }
}