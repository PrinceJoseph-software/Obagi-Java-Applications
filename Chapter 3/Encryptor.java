//Cryptography Program

import java.util.Scanner;

public class Encryptor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 4-digit number to encrypt: ");
        int number = input.nextInt();
        
        // Extract digits
        int d1 = number / 1000;
        int d2 = (number / 100) % 10;
        int d3 = (number / 10) % 10;
        int d4 = number % 10;
        
        // Encrypt each digit
        d1 = (d1 + 7) % 10;
        d2 = (d2 + 7) % 10;
        d3 = (d3 + 7) % 10;
        d4 = (d4 + 7) % 10;
        
        // Swap digits
        int encrypted = d3 * 1000 + d4 * 100 + d1 * 10 + d2;
        System.out.printf("Encrypted number: %04d%n", encrypted);
    }
}