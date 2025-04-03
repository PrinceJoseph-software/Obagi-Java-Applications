//Java program to accept 10 numbers from a user and display the sum of 4-10th number. Subtract the sum of 6-9th from the sum of the 4-10th number and display the result

import java.util.Scanner;

public class AcceptNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        int sum4To10 = 0, sum6To9 = 0;

       
        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter num%d: ", i + 1);
            numbers[i] = input.nextInt();
        }

      
        for (int i = 3; i < 10; i++) {
            sum4To10 += numbers[i];
        }

        
        for (int i = 5; i < 9; i++) {
            sum6To9 += numbers[i];
        }

        
        System.out.printf("Sum of 4th to 10th numbers: %d%n", sum4To10);
        System.out.printf("Sum of 6th to 9th numbers: %d%n", sum6To9);
        System.out.printf("Difference (Sum4To10 - Sum6To9): %d%n", sum4To10 - sum6To9);

    }
}
