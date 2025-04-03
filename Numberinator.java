import java.util.Scanner;

public class Numberinator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int negativeCount = 0, positiveCount = 0, zeroCount = 0;

        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();
            if (number > 0) positiveCount++;
            else if (number < 0) negativeCount++;
            else zeroCount++;
        }

        System.out.printf("Positives: %d%nNegatives: %d%nZeros: %d%n", positiveCount, negativeCount, zeroCount);
    }
}

//This is code is by no means property of Heinz Doofenshmirtz.
