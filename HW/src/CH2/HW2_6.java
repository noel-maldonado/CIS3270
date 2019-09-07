package CH2;
import java.util.Scanner;

public class HW2_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer between 0 and 1000: ");
		int num1 = in.nextInt();
		int num2 = num1;
		int sum = 0;
		sum += (num2 % 10);
		num2 /= 10;
		sum += (num2 % 10);
		num2 /= 10;
		sum += (num2 % 10);
		
		
		System.out.println("The sum of all digits in " + num1 + " is " + sum + ".");

		
		
		
	}

}