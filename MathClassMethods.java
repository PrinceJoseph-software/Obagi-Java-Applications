import java.util.Scanner;

public class MathClassMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        double num = scan.nextDouble();

        System.out.printf("The absolute value is %.2f%n", Math.abs(num));
        System.out.printf("The rounded value is %d%n", Math.round(num));
        System.out.printf("%.2f raised to the power of 2 is %.2f%n", num, Math.pow(num, 2));
        System.out.printf("The square root of %.2f is %.2f%n", num, Math.sqrt(num));
        System.out.printf("The powered value is %.2f%n", Math.pow(num, 2));
        System.out.println("------------------------------------------");

        System.out.print("Enter number: ");
        double num1 = scan.nextDouble();

        System.out.print("Enter number: ");
        double num2 = scan.nextDouble();

        System.out.printf("The minimum number is %.2f%n", Math.min(num1, num2));
        System.out.printf("The maximum number is %.2f%n", Math.max(num1, num2));
		
		System.out.println("------------------------------------------");
		
		System.out.printf("The area of a circle");
		
		double radius;
		double areaOfCircle;
		
		
		System.out.print("Enter radius: ")
		radius = scan.nextDouble();
		
		areaOfCircle = 2 * Math.PI * Math.pow(radius,2);
		
		System.out.printf("  ")
    }
}
