package CH4;
import java.util.Scanner;
public class HW4_11 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a decimal value (0 to 15): ");
		int dec = in.nextInt();
		if (dec >= 0 && dec <= 9)
			System.out.println("The hex value is " + dec);
		else if (dec >= 10 && dec <= 15)
			System.out.println("The hex value is " + (char)(dec + 'A' - 10));
		else
			System.out.println(dec + " is an invalid input");
		}
	}