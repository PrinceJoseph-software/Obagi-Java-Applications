import java.util.Scanner;

public class Multipleinator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("First 15 multiples of " + num + ":");
        
        int i = 1;
        while (i <= 15) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        }

    }
}

//This is code is by no means property of Heinz Doofenshmirtz.
