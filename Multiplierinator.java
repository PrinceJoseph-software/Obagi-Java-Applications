import java.util.Scanner;

public class Multiplierinator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number (1-12): ");
        int number = input.nextInt();

       
        if (number < 1 || number > 12) {
            System.out.println("Invalid input! Please enter a number between 1 and 12.");
        } else {
            System.out.println("Multiplication table for " + number + ":");
            for (int i = 1; i <= 12; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }

    }
}

//This is code is by no means property of Heinz Doofenshmirtz.
