import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = input.nextInt();
		
		
		int i = 1;
		while(i <= 12){
			System.out.println(num + " x " + i + " = " + num * 1);
			i++;
		

            }
    }
}
