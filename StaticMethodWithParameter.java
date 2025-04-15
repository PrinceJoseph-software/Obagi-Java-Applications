public class StaticMethodWithParameter {
    public static void main(String[] args) {
		int result = addiction(50,17);
		
		System.outprintf("The sum is %d.%n",result);
    }
	
	public static int addition(int num1 , int num2) {
		int sum = num1 +num2 ;
		
		return sum;

    }
}