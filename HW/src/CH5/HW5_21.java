package CH5;
import java.util.Scanner;
public class HW5_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter loan amount, for example 120000.95: ");
		double loan = input.nextDouble();
		System.out.print("Enter number of years as an integer,\nfor example 5: ");
		int years = input.nextInt();
		System.out.println("Interest Rate    Monthly Payment    Total Payment");		
		for (double i = 5.0; i <= 8; i += 0.125) {
			System.out.printf("%-5.3f", i);
			System.out.print("%           ");
			double interest = i / 1200;
			double pay = loan * interest / (1 - 1 / Math.pow(1 + interest, years * 12));
			System.out.printf("%-19.2f", pay);
			System.out.printf("%-8.2f\n",(pay * 12) * years);
		}
	}
}