////// This program that detremines odd and even number
//Exercise 2.25 (Odd or Even Number Check)

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        if (number % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
