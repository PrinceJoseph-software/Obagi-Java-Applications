import java.util.Scanner;

public class SwitchStatement{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter *131# To Load Data")
		System.out.println("Enter *310# To Check Balance")
		System.out.println("Enter *303# To Borrow Data")
		
		String option = input.nextLine();
		
		switch(option){
			case"*131#":
			{
				System.out.println("Enter 1 for 1 Month Plan");
				System.out.println("Enter 2 for 2 Month Plan");
				System.out.println("Enter 3 for 3 Month Plan");
				System.out.println("Enter 4 for 4 Month Plan");
			}	
			break;
		
		
		switch(option)
			case"*310#":
			{
			}	
			break;
		
		
		switch(option)
			case"*303#":
			{
			}	
			break;
		}	
		
	}	
}	