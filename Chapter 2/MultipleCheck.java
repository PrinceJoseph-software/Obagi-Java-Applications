////// This program determines multiples
//Exercise 2.26 (Multiples Check)

import java.util.Scanner;

public class MultipleCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 % num2 == 0)
            System.out.println(num1 + " is a multiple of " + num2);
        else
            System.out.println(num1 + " is not a multiple of " + num2);
    }
}
