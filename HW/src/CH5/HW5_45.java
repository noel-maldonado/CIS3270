package CH5;
import java.util.Scanner;
public class HW5_45 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double mean = 0; 	
		double deviation = 0;
		double number;
		for (int i = 1; i <= 10; i++) {
			System.out.print("Enter a number: ");
			number = in.nextDouble();
			mean += number;
			deviation += Math.pow(number, 2); 
		}
		deviation =  Math.sqrt((deviation - (Math.pow(mean, 2) / 10)) / (10 - 1));
		mean /= 10;

		// Display results
		System.out.println("The mean is " + mean);
		System.out.print("The standard deviation is ");
		System.out.printf("%.4f\n", deviation);
	}
}
