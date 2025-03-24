// This program display negative numbers
//Exercise 2.32 (Counting Negative, Positive, and Zero Values)

import java.util.Scanner;

public class CountNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int negativeCount = 0, positiveCount = 0, zeroCount = 0;

        System.out.println("Enter five numbers: ");
        for (int i = 0; i < 5; i++) {
            int number = input.nextInt();
            if (number > 0) positiveCount++;
            else if (number < 0) negativeCount++;
            else zeroCount++;
        }

        System.out.printf("Positives: %d%nNegatives: %d%nZeros: %d%n", positiveCount, negativeCount, zeroCount);
    }
}
